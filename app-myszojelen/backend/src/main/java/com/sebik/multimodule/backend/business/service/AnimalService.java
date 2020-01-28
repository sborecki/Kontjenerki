package com.sebik.multimodule.backend.business.service;

import com.sebik.multimodule.backend.data.entity.Animal;
import com.sebik.multimodule.backend.data.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Iterable<Animal> getAnimals() {
        return animalRepository.findAll();
    }
}
