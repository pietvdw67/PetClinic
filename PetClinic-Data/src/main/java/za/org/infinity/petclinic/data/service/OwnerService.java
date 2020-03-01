package za.org.infinity.petclinic.data.service;

import java.util.Set;

import za.org.infinity.petclinic.data.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();

}
