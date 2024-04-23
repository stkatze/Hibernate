package com.netology.controllers;

import com.netology.dto.PersonDTO;
import com.netology.model.Person;
import com.netology.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/persons/")
@AllArgsConstructor
public class PersonsController {

    private final PersonService service;

    @GetMapping("by-city")
    @ResponseBody
    public List<PersonDTO> getByCity(@RequestParam String city) {
        List<Person> persons = service.getPersonsByCity(city);
        return persons.stream()
                .map(
                        x -> PersonDTO.builder()
                                .id(x.getId())
                                .name(x.getName())
                                .surname(x.getSurname())
                                .age(x.getAge())
                                .phoneNumber(x.getPhoneNumber())
                                .city(x.getCity())
                                .build())
                .collect(Collectors.toList());
    }

}