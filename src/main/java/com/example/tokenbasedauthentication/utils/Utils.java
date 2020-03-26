package com.example.tokenbasedauthentication.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.lang.reflect.Field;

public class Utils {


    static public ResponseEntity<?> badRequestResponse (int code, String message) {
        ErrorResponseModel errorResponseModel = new ErrorResponseModel(HttpStatus.BAD_REQUEST.value(),code,message);
        return new ResponseEntity<>(errorResponseModel, HttpStatus.BAD_REQUEST);
    }

}