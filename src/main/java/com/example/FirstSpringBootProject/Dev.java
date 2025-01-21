package com.example.FirstSpringBootProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    //Method 1: Field injection
    //@Autowired
    private Code code;

    //Method 2: Through constructor
//    Dev(Code code) {
//        this.code = code;
//    }
//
    //Method 3: Through setters
    @Autowired
    public void setCode(Code code) {
        this.code = code;
    }
    public void build() {
        System.out.println("Working on an awesome project!");
        code.coding();
    }
}
