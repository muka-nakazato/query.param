package com.example.query.param;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/")
    public String handleQueryParam(ApplicationQueryParam applicationQueryParam){
        return "Hello World!";
    }
}
