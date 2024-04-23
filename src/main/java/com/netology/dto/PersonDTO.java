package com.netology.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PersonDTO {
    private Long id;
    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    private String city;
}