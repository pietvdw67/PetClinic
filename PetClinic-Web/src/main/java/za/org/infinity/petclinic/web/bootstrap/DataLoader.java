package za.org.infinity.petclinic.web.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import za.org.infinity.petclinic.data.model.Owner;
import za.org.infinity.petclinic.data.model.Pet;
import za.org.infinity.petclinic.data.model.PetType;
import za.org.infinity.petclinic.data.model.Speciality;
import za.org.infinity.petclinic.data.model.Vet;
import za.org.infinity.petclinic.data.model.Visit;
import za.org.infinity.petclinic.data.service.OwnerService;
import za.org.infinity.petclinic.data.service.PetService;
import za.org.infinity.petclinic.data.service.PetTypeService;
import za.org.infinity.petclinic.data.service.SpecialityService;
import za.org.infinity.petclinic.data.service.VetService;
import za.org.infinity.petclinic.data.service.VisitService;

@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService; 
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialityService specialityService;
	private final VisitService visitService;
	private final PetService petService;
	 
	public DataLoader(OwnerService ownerService,VetService vetService,PetTypeService petTypeService,SpecialityService specialityService,VisitService visitService,PetService petService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialityService = specialityService;
		this.visitService = visitService;
		this.petService = petService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		int count = petTypeService.findAll().size();
		
		if (count ==0 ) {
			loadData();
		}
		
		
	}

	private void loadData() {
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
		petService.save(mikesPet);
		
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
		petService.save(fionasCat);
		
		Visit visit = new Visit();
		visit.setPet(fionasCat);
		visit.setDate(LocalDate.now());
		visit.setDescription("Sneezy Kitty");		
		visitService.save(visit);
		
		System.out.println("Loaded Owners ...");
		
		Speciality radiology = new Speciality();
		radiology.setDescription("Radiology");
		Speciality savedRadiology = specialityService.save(radiology);
		Speciality surgery = new Speciality();
		surgery.setDescription("Surgery");
		Speciality savedSurgery = specialityService.save(surgery);
		Speciality dentistry = new Speciality();
		dentistry.setDescription("Dentistry");
		Speciality savedDentistry = specialityService.save(dentistry);
		
		Vet vet1 = new Vet();		
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vet1.getSpecialities().add(savedRadiology);
		vetService.save(vet1);
		
		Vet vet2 = new Vet();		
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vet2.getSpecialities().add(savedSurgery);
		vetService.save(vet2);
		
		System.out.println("Loaded vets ...");
	}

}
