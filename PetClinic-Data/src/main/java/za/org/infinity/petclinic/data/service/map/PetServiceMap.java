package za.org.infinity.petclinic.data.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import za.org.infinity.petclinic.data.model.Pet;
import za.org.infinity.petclinic.data.service.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
	
	

}
