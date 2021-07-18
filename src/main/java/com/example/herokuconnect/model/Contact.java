package com.example.herokuconnect.model;

import javax.persistence.Entity;

@Entity
public class Contact {

	private Long Id;
	private String FirstName;
	private String LastName;
	private String MiddleName;
	private String Name;

	@javax.persistence.Id
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Contact contact = (Contact) o;

		if (Id != null ? !Id.equals(contact.Id) : contact.Id != null) return false;
		if (FirstName != null ? !FirstName.equals(contact.FirstName) : contact.FirstName != null) return false;
		if (LastName != null ? !LastName.equals(contact.LastName) : contact.LastName != null) return false;
		if (MiddleName != null ? !MiddleName.equals(contact.MiddleName) : contact.MiddleName != null) return false;
		return Name != null ? Name.equals(contact.Name) : contact.Name == null;
	}

	@Override
	public int hashCode() {
		int result = Id != null ? Id.hashCode() : 0;
		result = 31 * result + (FirstName != null ? FirstName.hashCode() : 0);
		result = 31 * result + (LastName != null ? LastName.hashCode() : 0);
		result = 31 * result + (MiddleName != null ? MiddleName.hashCode() : 0);
		result = 31 * result + (Name != null ? Name.hashCode() : 0);
		return result;
	}
}
