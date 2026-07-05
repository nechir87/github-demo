
package com.dastan.githubapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
    @GetMapping("/")
    public String hello(){
        return "Hello, world!";
    }
}
