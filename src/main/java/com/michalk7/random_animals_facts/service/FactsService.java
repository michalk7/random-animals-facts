package com.michalk7.random_animals_facts.service;

import com.michalk7.random_animals_facts.model.Fact;

import java.util.List;

public interface FactsService {
    List<Fact> callApiForFacts(String animalType, int factsAmount);
}
