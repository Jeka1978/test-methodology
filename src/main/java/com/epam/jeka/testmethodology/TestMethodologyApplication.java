package com.epam.jeka.testmethodology;

import com.epam.jeka.testmethodology.services.NotNeededServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestMethodologyApplication {

    @Bean
    public NotNeededServices notNeededServices3(){
        return new NotNeededServices();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TestMethodologyApplication.class, args);
        System.out.println();
    }

}
