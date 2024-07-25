package com.management.HealthCare.UserAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth/user")
public class UserAuthController {
	@Autowired
	UserAuthServiceImpl service;

	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody UserDto dto){
		Boolean response =service.login(dto);
		if (response) 
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Login Successful");
		 else
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Invalid user details");
	}
	
}
