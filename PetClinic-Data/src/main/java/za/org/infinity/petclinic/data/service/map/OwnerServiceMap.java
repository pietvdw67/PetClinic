package za.org.infinity.petclinic.data.service.map;

import java.util.Set;

import za.org.infinity.petclinic.data.model.Owner;
import za.org.infinity.petclinic.data.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner,Long>{

	@Override
	public Owner save(Owner object) {
		return super.save(object.id,object);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {		
		return super.findById(id);
	}

	@Override
	public Owner save(Long id, Owner object) {		
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) { 
		super.delete(object);
	}




}
