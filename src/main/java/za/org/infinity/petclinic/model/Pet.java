package za.org.infinity.petclinic.model;

import java.time.LocalDate;

public class Pet {
	
	private PetType petType;
	private Owner onwer;
	private LocalDate birthDate;
	
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOnwer() {
		return onwer;
	}
	public void setOnwer(Owner onwer) {
		this.onwer = onwer;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}
