package com.example.herokuconnect.repository;

import com.example.herokuconnect.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	List<Contact> findByFirstName(String FirstName);
	List<Contact> findAll();
}
