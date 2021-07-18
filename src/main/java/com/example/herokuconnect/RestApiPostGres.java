package com.example.herokuconnect;

import com.example.herokuconnect.model.Contact;
import com.example.herokuconnect.repository.ContactRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.*;

import java.io.Serializable;
import java.util.List;

@RestController
public class RestApiPostGres {

	@Autowired
	ContactRepository contactRepository;


	@GetMapping(path = "/fetchAllContacts")
	public Flux<Contact> fetchAllContacts(){
		Gson gson = new Gson();
		System.out.println("contactRepository -> "+contactRepository);
		return contactRepository.findAll();
	}
}
