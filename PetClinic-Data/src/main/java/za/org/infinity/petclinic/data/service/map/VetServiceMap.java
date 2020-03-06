package za.org.infinity.petclinic.data.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import za.org.infinity.petclinic.data.model.Speciality;
import za.org.infinity.petclinic.data.model.Vet;
import za.org.infinity.petclinic.data.service.SpecialityService;
import za.org.infinity.petclinic.data.service.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	private final SpecialityService specialityService;
	
	public VetServiceMap(SpecialityService specialityService) {
		this.specialityService = specialityService;
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet save(Vet object) {
		
		if (object.getSpecialities().size() > 0) {
			object.getSpecialities().forEach(speciality -> {
				if (speciality.getId() == null) {
					Speciality savedSpeciality = specialityService.save(speciality);
					speciality.setId(savedSpeciality.getId());
				}
			});
		}
		
		return super.save(object);
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
