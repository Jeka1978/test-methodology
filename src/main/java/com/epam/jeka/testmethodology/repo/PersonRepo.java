package com.epam.jeka.testmethodology.repo;

import com.epam.jeka.testmethodology.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Integer> {


}
