package za.org.infinity.petclinic.data.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pets")
public class Pet extends BaseEntity {
	
	@Column(name="name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="type_id")
	private PetType petType;
	
	@ManyToOne
	@JoinColumn(name="owner_id")
	private Owner onwer;
	
	@Column(name="birth_date")
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
