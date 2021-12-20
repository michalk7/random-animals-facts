package com.michalk7.random_animals_facts.controller;

import com.michalk7.random_animals_facts.dto.GeneratorParametersDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"", "/", "/home"})
    public String mainPage(Model model) {
        if(!model.containsAttribute("generatorParameters")) {
            GeneratorParametersDTO generatorParameters = new GeneratorParametersDTO();
            model.addAttribute("generatorParameters", generatorParameters);
        }
        if(!model.containsAttribute("validated")) {
            model.addAttribute("validated", false);
        }

        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}
