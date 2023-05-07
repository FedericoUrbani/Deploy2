package com.develhope.Deploy2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class NumController {
    @GetMapping
    public int randomInt (){
        Random random = new Random();
        int a = random.nextInt();
        int b =  random.nextInt();
        return a+b;
    }

}
