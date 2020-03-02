package za.org.infinity.petclinic.data.service.map;

import java.util.Set;

import za.org.infinity.petclinic.data.model.Vet;
import za.org.infinity.petclinic.data.service.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet,Long>{

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		return super.save(object.id, object);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet save(Long id, Vet object) {
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
	
	
	
	

}
