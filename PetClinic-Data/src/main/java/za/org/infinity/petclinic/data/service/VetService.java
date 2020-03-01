package za.org.infinity.petclinic.data.service;

import java.util.Set;

import za.org.infinity.petclinic.data.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();

}
