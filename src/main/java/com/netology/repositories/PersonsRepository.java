package com.netology.repositories;

import com.netology.model.Person;

import java.util.List;

public interface PersonsRepository {
    Person save(Person person);

    void delete(Person person);

    void update(Person person);

    List<Person> findPersonsByCity(String city);

    List<Person> findAll();

}