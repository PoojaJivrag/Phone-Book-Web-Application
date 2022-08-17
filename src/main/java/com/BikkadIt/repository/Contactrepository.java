package com.BikkadIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIt.model.Contact;

public interface Contactrepository extends JpaRepository<Contact, Integer>{

}
