package za.org.infinity.petclinic.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import za.org.infinity.petclinic.data.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Long>{
	
	public Owner findByLastName(String lastName);

}
