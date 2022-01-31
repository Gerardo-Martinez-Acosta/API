package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer>{
	
	@Transactional(readOnly = true)
	Optional<Users> findByUsername(String username);
	
}