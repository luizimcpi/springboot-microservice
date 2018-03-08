package com.concrete.personserviceh2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.concrete.personserviceh2.model.Person;
import com.concrete.personserviceh2.repository.PersonRepository;

@Service
public class PersonService {
	
    private PersonRepository personRepository;
	
    @Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public Person save(@Validated Person person) {
        return personRepository.save(person);
    }

    public Optional<Person> findById(Integer id){
        return personRepository.findById(id);
    }

    public Iterable<Person> findAll(){
        return personRepository.findAll();
    }

    public void delete(Integer id) {
    	personRepository.deleteById(id);
    }
}
