package za.org.infinity.petclinic.data.service.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import za.org.infinity.petclinic.data.model.Owner;
import za.org.infinity.petclinic.data.model.Pet;
import za.org.infinity.petclinic.data.service.OwnerService;
import za.org.infinity.petclinic.data.service.PetService;
import za.org.infinity.petclinic.data.service.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{
	
	private final PetTypeService petTypeService;
	private final PetService petservice;
	
	public OwnerServiceMap(PetTypeService petTypeService,PetService petservice) {
		this.petTypeService = petTypeService;
		this.petservice = petservice;
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
	public Owner save(Owner object) {	
		Owner savedOwner = null;
		
		if(object !=null) {
			
			if (object.getPets() != null) {
				object.getPets().forEach(pet -> {
					if (pet.getPetType() != null) {
						if (pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
						
					} else {
						throw new RuntimeException("Pet type is required");
					}
					
					if(pet.getId() == null ) {
						Pet savedPet = petservice.save(pet);
						pet.setId(savedPet.getId());
						
					}
					
				});
			}
			
			return super.save(object);
		} 
		else {
			return null;
		}
		
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) { 
		super.delete(object);
	}
	
	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}




}
