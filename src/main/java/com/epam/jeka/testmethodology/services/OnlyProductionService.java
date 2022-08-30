package com.epam.jeka.testmethodology.services;

import com.epam.jeka.testmethodology.ConditionalOnNotTestEnvironment;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@ConditionalOnNotTestEnvironment
public class OnlyProductionService {

    @PostConstruct
    public void init(){
        throw new RuntimeException("PROD failed!!!");
    }
}
