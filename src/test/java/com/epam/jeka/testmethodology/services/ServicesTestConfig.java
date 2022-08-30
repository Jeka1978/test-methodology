package com.epam.jeka.testmethodology.services;

import com.epam.jeka.testmethodology.repo.PersonRepo;
import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@TestConfiguration
public class ServicesTestConfig {
    @Bean
    @Primary
    public PersonRepo mockPersonRepo(){
        return new PersonRepoMock();
    }

    @Bean
    @Primary
    public NotNeededServices nns(){
        return Mockito.mock(NotNeededServices.class);
    }
}
