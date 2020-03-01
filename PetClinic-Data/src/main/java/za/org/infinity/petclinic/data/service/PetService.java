package za.org.infinity.petclinic.data.service;

import java.util.Set;

import za.org.infinity.petclinic.data.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	Pet save(Pet Pet);
	Set<Pet> findAll();

}
