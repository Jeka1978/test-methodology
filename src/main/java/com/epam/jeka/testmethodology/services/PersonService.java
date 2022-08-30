package com.epam.jeka.testmethodology.services;

import com.epam.jeka.testmethodology.model.Person;

import java.util.List;

public interface PersonService {
    void savePerson();
    List<Person> getAllValidPersons();
}
