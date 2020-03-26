package com.example.tokenbasedauthentication.user;


import com.example.tokenbasedauthentication.user.models.LoginModel;
import com.example.tokenbasedauthentication.user.models.RegisterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.security.Principal;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginModel loginModel, HttpSession session){
      return userService.login(loginModel,session);
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterModel registerModel){
        return userService.register(registerModel);
    }

    @GetMapping("/verifyAccess")
    public ResponseEntity<?> verifyAccess() {
        return userService.verifyAccess();
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout(Principal principal){
        return userService.logout(principal);
    }

}
