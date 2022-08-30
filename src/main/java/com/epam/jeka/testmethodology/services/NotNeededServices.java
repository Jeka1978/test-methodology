package com.epam.jeka.testmethodology.services;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class NotNeededServices {

    @PostConstruct
    public void init(){
        System.out.println("you don't need to see this");
        throw new RuntimeException("!!!!!!!!!!");
    }
}
