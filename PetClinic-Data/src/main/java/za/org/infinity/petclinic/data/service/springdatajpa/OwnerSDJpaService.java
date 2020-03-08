package za.org.infinity.petclinic.data.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import za.org.infinity.petclinic.data.model.Owner;
import za.org.infinity.petclinic.data.repository.OwnerRepository;
import za.org.infinity.petclinic.data.repository.PetRepository;
import za.org.infinity.petclinic.data.repository.PetTypeRepository;
import za.org.infinity.petclinic.data.service.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {
	
	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;
	
	public OwnerSDJpaService(OwnerRepository ownerRepository,PetRepository petRepository,PetTypeRepository petTypeRepository) {
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().iterator().forEachRemaining(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long id) {
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner object) {
		return ownerRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		ownerRepository.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		ownerRepository.deleteById(id);
		
	}

	@Override
	public Owner findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}

}
