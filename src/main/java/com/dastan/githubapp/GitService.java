
package com.dastan.githubapp;

import org.springframework.stereotype.Service;

@Service
public class GitService {
    
    public String gitData(){
        return "git push origin main";
    }
}
