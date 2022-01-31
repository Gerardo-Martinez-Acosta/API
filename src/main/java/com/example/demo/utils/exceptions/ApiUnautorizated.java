package com.example.demo.utils.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class ApiUnautorizated extends Exception{
	
	public ApiUnautorizated(String message) {
		super(message);
	}

}
