package com.example.herokuconnect.repository;

import com.example.herokuconnect.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ContactRepository extends ReactiveCrudRepository<Contact, Long> {
}
