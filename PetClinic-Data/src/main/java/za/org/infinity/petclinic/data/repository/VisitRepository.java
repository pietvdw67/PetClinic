package za.org.infinity.petclinic.data.repository;

import org.springframework.data.repository.CrudRepository;

import za.org.infinity.petclinic.data.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long>{

}
