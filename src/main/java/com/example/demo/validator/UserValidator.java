package com.example.demo.validator;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UserRequest;
import com.example.demo.utils.exceptions.ApiUnprocessableEntity;

@Service
public interface UserValidator {
	void validator(UserRequest request) throws ApiUnprocessableEntity;
}
