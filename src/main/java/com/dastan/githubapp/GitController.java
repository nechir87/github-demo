
package com.dastan.githubapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
    @Autowired
    GitService gitService;
    
    @GetMapping("/")
    public String hello(){
        return gitService.gitData();
    }
    @GetMapping("/hi/{greet}")
    public String greet(@PathVariable String greet){
        return "Hello " + greet;
    }
}
