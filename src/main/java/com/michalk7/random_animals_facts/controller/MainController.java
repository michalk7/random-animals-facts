package com.michalk7.random_animals_facts.controller;

import com.michalk7.random_animals_facts.dto.GeneratorParametersDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"", "/"})
    public String mainPage(Model model) {
        GeneratorParametersDTO generatorParameters = new GeneratorParametersDTO();
        model.addAttribute("generatorParameters", generatorParameters);
        return "home";
    }

}
