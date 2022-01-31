package com.example.demo.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class UserRequest implements Serializable {
	
	@JsonProperty("firstName")
	private String firstname;

	@JsonProperty("lastName")
	private String lastname;
	
	@JsonProperty("userName")
	private String username;
	
	@JsonProperty("password")
	private String password;
}
