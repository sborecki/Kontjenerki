package com.sebik.multimodule.backend.data.repository;

import com.sebik.multimodule.backend.data.entity.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {}
