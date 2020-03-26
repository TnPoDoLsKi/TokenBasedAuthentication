package com.example.tokenbasedauthentication.config;

import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.OrRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

public class SecureURLs {
    private static final RequestMatcher PROTECTED_URLS = new OrRequestMatcher(

        new AntPathRequestMatcher("/api/v1/logout"),
        new AntPathRequestMatcher("/api/v1/verifyAccess")

    );

    public static RequestMatcher getProtectedUrls() {
        return PROTECTED_URLS;
    }
}
