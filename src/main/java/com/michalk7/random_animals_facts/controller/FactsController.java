package com.michalk7.random_animals_facts.controller;

import com.michalk7.random_animals_facts.dto.GeneratorParametersDTO;
import com.michalk7.random_animals_facts.model.Fact;
import com.michalk7.random_animals_facts.service.FactsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/facts")
public class FactsController {

    private FactsService factsService;

    public FactsController(FactsService factsService) {
        this.factsService = factsService;
    }

    @PostMapping("/generate")
    public String generateFacts(@ModelAttribute("generatorParameters")GeneratorParametersDTO generatorParametersDTO, Model model) {
        String animalType = generatorParametersDTO.getAnimalType();
        int factsAmount = generatorParametersDTO.getFactsAmount();

        List<Fact> facts = factsService.callApiForFacts(animalType, factsAmount);

        model.addAttribute("factList", facts);

        return "facts-page";
    }

}
