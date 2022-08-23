package com.BikkadIt.service;

import java.util.List;



import com.BikkadIt.model.Contact;


public interface ContactService {
  
	
	 boolean  saveContact(Contact contact);
	  List<Contact>  getAllContact();
	  Contact    getContactById(Integer contactId);
	  boolean deleteContactById(Integer contactId);
	boolean updateContact(Contact contact);
	
}
