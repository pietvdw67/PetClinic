package za.org.infinity.petclinic.data.repository;

import org.springframework.data.repository.CrudRepository;

import za.org.infinity.petclinic.data.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long>{

}
