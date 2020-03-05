package za.org.infinity.petclinic.web.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import za.org.infinity.petclinic.data.model.Owner;
import za.org.infinity.petclinic.data.model.Pet;
import za.org.infinity.petclinic.data.model.PetType;
import za.org.infinity.petclinic.data.model.Vet;
import za.org.infinity.petclinic.data.service.OwnerService;
import za.org.infinity.petclinic.data.service.PetTypeService;
import za.org.infinity.petclinic.data.service.VetService;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService; 
	private final VetService vetService;
	private final PetTypeService petTypeService;
	 
	public DataLoader(OwnerService ownerService,VetService vetService,PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatType = petTypeService.save(cat);
		
		Owner owner1 = new Owner();		
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("123 Brickerel");
		owner1.setCity("Miami");
		owner1.setTelephone("123123123");
		ownerService.save(owner1);
		
		Pet mikesPet = new Pet();
		mikesPet.setPetType(savedDogType);
		mikesPet.setOnwer(owner1);
		mikesPet.setBirthDate(LocalDate.now());
		mikesPet.setName("Rosco");
		owner1.getPets().add(mikesPet);
		
		Owner owner2 = new Owner();		
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("123 Brickerel");
		owner2.setCity("Miami");
		owner2.setTelephone("123123123");
		ownerService.save(owner2);
		
		Pet fionasCat = new Pet();
		fionasCat.setPetType(savedCatType);
		fionasCat.setOnwer(owner2);
		fionasCat.setBirthDate(LocalDate.now());
		fionasCat.setName("Kitty");
		owner2.getPets().add(fionasCat);
		
		System.out.println("Loaded Owners ...");
		
		Vet vet1 = new Vet();		
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();		
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vetService.save(vet2);
		
		System.out.println("Loaded vets ...");
		
		
	}

}
