package com.example.herokuconnect.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {

	private String sfid;
	private String firstname;
	private String lastname;
	private String name;

	@Id
	public String getSfid() {
		return sfid;
	}

	public void setSfid(String sfid) {
		this.sfid = sfid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
