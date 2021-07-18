package com.example.herokuconnect;

import com.example.herokuconnect.model.Contact;
import com.example.herokuconnect.repository.ContactRepository;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestApiPostGres {

	final ContactRepository contactRepository;

	public RestApiPostGres(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}

	@GetMapping(path = "/fetchAllContacts")
	public String fetchAllContacts(){
		Gson gson = new Gson();
		System.out.println("contactRepository -> "+contactRepository);
		List<Contact> all = contactRepository.findAll();
		System.out.println("all -> "+all.isEmpty());
		return gson.toJson(all);
	}
}
