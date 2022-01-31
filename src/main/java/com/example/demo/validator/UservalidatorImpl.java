package com.example.demo.validator;

import org.springframework.stereotype.Component;

import com.example.demo.dto.UserRequest;
import com.example.demo.utils.exceptions.ApiUnprocessableEntity;

@Component
public class UservalidatorImpl implements UserValidator{

	@Override
	public void validator(UserRequest request) throws ApiUnprocessableEntity {
		if(request.getFirstname()==null || request.getFirstname().isEmpty()) {
			message("El nombre es obligatorio");
		}
		
		if(request.getFirstname().length()<3) {
			message("El nombre es muy corto, debe tener minimo 3 caracteres");
		}
		
		if(request.getLastname()==null||request.getLastname().isEmpty()) {
			this.message("El apellido es obligatorio");
		}
		
		if(request.getLastname().length()<3) {
			message("El apellido es muy corto, debe tener minimo 3 caracteres");
		}
		
		if(request.getUsername()==null||request.getLastname().isEmpty()) {
			this.message("El username es obligatorio");
		}
		
		if(request.getUsername().length()<6) {
			message("El username es muy corto, debe tener minimo 3 caracteres");
		}
		
		if(request.getPassword()==null||request.getLastname().isEmpty()) {
			this.message("El password es obligatorio");
		}
		
		if(request.getPassword().length()<8) {
			message("El password es muy corto, debe tener minimo 3 caracteres");
		}
	}

	private void message(String message) throws ApiUnprocessableEntity {
		throw new ApiUnprocessableEntity(message);
	}
}
