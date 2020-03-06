package za.org.infinity.petclinic.data.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import za.org.infinity.petclinic.data.model.Speciality;
import za.org.infinity.petclinic.data.service.SpecialityService;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {

	@Override
	public Set<Speciality> findAll() { 
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object) {
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}

	
}
