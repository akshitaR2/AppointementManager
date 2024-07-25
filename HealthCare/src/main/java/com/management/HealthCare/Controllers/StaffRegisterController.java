package com.management.HealthCare.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.management.HealthCare.Models.DoctorsDTO;
import com.management.HealthCare.Models.RegisterDTO;
import com.management.HealthCare.Service.StaffRegisterService;
import com.management.HealthCare.UserAuthentication.UserDto;

@RestController
@RequestMapping("/api/addStaff")
public class StaffRegisterController {
	
	@Autowired
	StaffRegisterService service;
	
	
	
	
	@PostMapping("/addDoctors")
	public ResponseEntity<String> addDoctor(@RequestBody RegisterDTO dto){
		
			return ResponseEntity.ok().body(service.addDoctor(dto));
			
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<String> addUser(@RequestBody UserDto dto){
		Boolean response =service.addUser(dto);
		if (response) 
			return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
		 else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Already exists");
	}
	
	@PostMapping("/addPatient")
	public ResponseEntity<String> addPatient(@RequestBody RegisterDTO dto){
		Boolean response =service.addPatient(dto);
		if (response) 
			return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
		 else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Already exists");
	}
	

}
