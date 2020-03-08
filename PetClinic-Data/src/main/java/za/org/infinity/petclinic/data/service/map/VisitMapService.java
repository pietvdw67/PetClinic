package za.org.infinity.petclinic.data.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import za.org.infinity.petclinic.data.model.Visit;
import za.org.infinity.petclinic.data.service.VisitService;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService{

	@Override
	public Visit save(Visit object) {
		
		if (object.getPet() == null || object.getPet().getOnwer() == null || object.getPet().getId()== null
				|| object.getPet().getOnwer().getId() == null ) {
			throw new RuntimeException("Invalid visit");
		}
		
		return super.save(object);
	}

	@Override
	public void delete(Visit object) {
		super.delete(object);
		
	}

	@Override
	public Set<Visit> findAll() {
		return super.findAll();

	}

	@Override
	public Visit findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
