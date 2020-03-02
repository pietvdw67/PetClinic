package za.org.infinity.petclinic.data.service;

import za.org.infinity.petclinic.data.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{
	
	Owner findByLastName(String lastName);	

}
