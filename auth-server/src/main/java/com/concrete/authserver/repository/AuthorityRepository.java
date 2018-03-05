package com.concrete.authserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.concrete.authserver.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}
