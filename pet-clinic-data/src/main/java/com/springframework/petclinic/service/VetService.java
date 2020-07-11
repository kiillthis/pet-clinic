package com.springframework.petclinic.service;

import java.util.Set;

public interface VetService {

    PetService findById(Long id);

    PetService save(PetService pet);

    Set<PetService> findAll();
}
