package com.example.demo.services.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserRequest;
import com.example.demo.dto.UsersDTO;

@Service
public interface IUsersService {
	
	List<UsersDTO> findAll();
	
	UsersDTO findByUsername(String username);
	
	UsersDTO findById(int userId);
	
	void save(UserRequest user);
	
	void update(UserRequest user, int userId);
	
	void saveAll(List<UserRequest> users);
	
	void deleteById(int userId);
	
	
	
}
