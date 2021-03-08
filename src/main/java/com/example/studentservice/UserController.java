package com.example.studentservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(value = "/user/")
public class UserController {

    @RequestMapping("/")
    public Principal showPrincipal(Principal principal){
        return principal;
    }

}
