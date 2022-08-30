package com.epam.jeka.testmethodology.services;

import com.epam.jeka.testmethodology.TestMethodologyApplication;
import com.epam.jeka.testmethodology.model.Person;
import com.epam.jeka.testmethodology.repo.PersonRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.config.BootstrapMode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = ServicesTestConfig.class,properties = "spring.main.lazy-initialization=true")
@EnableJpaRepositories(bootstrapMode = BootstrapMode.LAZY, basePackages = "com.epam.jeka.testmethodology")
//@ComponentScan(lazyInit = true,basePackages = "com.epam.jeka.testmethodology")
//@ComponentScan(lazyInit = true,basePackageClasses = TestMethodologyApplication.class)
@MockBean(AnotherService.class)
//@MockBean(NotNeededServices.class)
class PersonServiceImplTest {
    @Autowired
    PersonService personService;

    @Autowired
    ApplicationContext context;


    @Test
    void getAllValidPersons() {
        List<Person> allValidPersons = personService.getAllValidPersons();
        assertEquals(3, allValidPersons.size());
    }
}