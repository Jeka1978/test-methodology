package com.epam.jeka.testmethodology.services;

import com.epam.jeka.testmethodology.model.Person;
import com.epam.jeka.testmethodology.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepo repo;

    @Autowired
    private NotNeededServices notNeededServices5;

    @Autowired
    private AnotherService abc;

    @Override
    public void savePerson() {

    }

    @Override
    public List<Person> getAllValidPersons() {
       return repo.findAll().stream().filter(person -> Character.isUpperCase(person.getName().charAt(0))).toList();
    }
}
