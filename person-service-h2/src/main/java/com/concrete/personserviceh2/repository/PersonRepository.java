package com.concrete.personserviceh2.repository;

import org.springframework.data.repository.CrudRepository;

import com.concrete.personserviceh2.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
