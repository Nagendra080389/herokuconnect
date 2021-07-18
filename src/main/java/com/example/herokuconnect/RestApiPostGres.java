package com.example.herokuconnect;

import com.example.herokuconnect.model.Contact;
import com.example.herokuconnect.repository.ContactRepository;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
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
		ContactWrapper contactWrapper = new ContactWrapper();
		contactWrapper.setContacts(all);
		contactWrapper.setTotalSize(String.valueOf(all.size()));
		return gson.toJson(contactWrapper);
	}

	private static class ContactWrapper implements Serializable {
		private String totalSize;
		private List<Contact> contacts;

		public String getTotalSize() {
			return totalSize;
		}

		public void setTotalSize(String totalSize) {
			this.totalSize = totalSize;
		}

		public List<Contact> getContacts() {
			return contacts;
		}

		public void setContacts(List<Contact> contacts) {
			this.contacts = contacts;
		}
	}
}
