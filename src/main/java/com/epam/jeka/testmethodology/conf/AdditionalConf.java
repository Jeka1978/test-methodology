package com.epam.jeka.testmethodology.conf;

import com.epam.jeka.testmethodology.services.NotNeededServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AdditionalConf {
    @Bean
    public NotNeededServices notNeededServices2(){
        return new NotNeededServices();
    }
}
