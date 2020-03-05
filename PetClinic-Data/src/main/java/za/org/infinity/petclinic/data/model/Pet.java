package za.org.infinity.petclinic.data.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {
	
	private String name;
	private PetType petType;
	private Owner onwer;
	private LocalDate birthDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
