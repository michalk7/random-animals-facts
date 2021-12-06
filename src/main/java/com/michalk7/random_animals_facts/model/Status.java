package com.michalk7.random_animals_facts.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Status {
    private boolean verified;
    private int sentCount;
}
