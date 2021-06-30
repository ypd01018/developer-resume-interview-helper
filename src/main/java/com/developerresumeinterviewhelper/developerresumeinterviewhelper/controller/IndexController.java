package com.developerresumeinterviewhelper.developerresumeinterviewhelper.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "hello";
    }


}
