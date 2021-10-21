package com.example.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Concontroller {

    @Value("${one}")
    private String one;
//
//    @Value("${two}")
//    private String two;
//
//    @Value("${three}")
//    private String three;

    @RequestMapping("/conn")
    private String  configgit(){
        return this.one;
    }
}
