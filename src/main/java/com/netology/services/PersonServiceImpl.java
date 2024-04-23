package com.netology.services;

import com.netology.model.Person;
import com.netology.repositories.PersonsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonsRepository personsRepository;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return personsRepository.findPersonsByCity(city);
    }
}