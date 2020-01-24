package com.sebik.multimodule.frontend.web;

import com.google.common.collect.Lists;
import com.sebik.multimodule.backend.business.service.AnimalService;
import com.sebik.multimodule.backend.data.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("/animals")
public class AnimalsWebController {
    private final AnimalService animalService;

    @Autowired
    public AnimalsWebController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public String get(Model model) {
        Collection<Animal> animals = Lists.newArrayList(this.animalService.getAnimals());
        model.addAttribute("animals", animals);
        return "animals";
    }

}
