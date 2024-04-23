package com.netology.services;

import com.netology.model.Person;

import java.util.List;

public interface PersonService {

    List<Person> getPersonsByCity(String city);

}