package com.springframework.petclinic.bootstrap;

import com.springframework.petclinic.model.Owner;
import com.springframework.petclinic.model.PetType;
import com.springframework.petclinic.model.Vet;
import com.springframework.petclinic.service.OwnerService;
import com.springframework.petclinic.service.PetTypeService;
import com.springframework.petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(dog);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners ...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Jesse");
        vet1.setLastName("Rosses");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Andrew");
        vet2.setLastName("Chuck");

        vetService.save(vet2);

        System.out.println("Loaded Vets ...");

    }
}
