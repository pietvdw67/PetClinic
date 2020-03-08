package za.org.infinity.petclinic.data.repository;

import org.springframework.data.repository.CrudRepository;

import za.org.infinity.petclinic.data.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {

}
