package com.michalk7.random_animals_facts.controller;

import com.michalk7.random_animals_facts.dto.GeneratorParametersDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage(Model model) {
        GeneratorParametersDTO generatorParameters = new GeneratorParametersDTO();
        model.addAttribute("generatorParameters", generatorParameters);
        return "main-page";
    }

    @PostMapping("/facts/generate")
    public String generateFact(@ModelAttribute("generatorParameters") GeneratorParametersDTO generatorParametersDTO) {
        String tmp = generatorParametersDTO.getAnimalType();

        return "main-page";
    }

}
