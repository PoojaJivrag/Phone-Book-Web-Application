package com.BikkadIt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIt.model.Contact;
import com.BikkadIt.repository.Contactrepository;
import com.BikkadIt.service.ContactService;
@Service
public class ContactServiceImpl implements ContactService {
	
	
	
	@Autowired
	private Contactrepository contactrepository;

	
	
	@Override
	public boolean saveContact(Contact contact) {
		Contact save = contactrepository.save(contact);
		
		if(contact!=null) {
		return true;
		}
		return false;
	}

	@Override
	public List<Contact> getAllContact() {
		
		List<Contact> list = contactrepository.findAll();
		return list;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		 Contact byId = contactrepository.findById(contactId).get();
		return byId;
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		Contact contact = contactrepository.findById(contactId).get();
		if(contact != null) {
			contactrepository.deleteById(contactId);
			return true;
		}
		
		return false;
	}

}
