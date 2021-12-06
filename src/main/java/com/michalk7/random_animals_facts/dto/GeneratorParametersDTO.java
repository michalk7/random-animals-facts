package com.michalk7.random_animals_facts.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GeneratorParametersDTO {
    private String animalType;
    private int factsAmount;
}
