package com.management.HealthCare.Models;

import com.management.HealthCare.UserAuthentication.UserDto;

public class RegisterDTO {
	private UserDto userDto;
	private PatientsDTO patientsDTO;
	private DoctorsDTO doctorsDTO;
	
	
	
	public DoctorsDTO getDoctorsDTO() {
		return doctorsDTO;
	}

	public UserDto getUserDto() {
		return userDto;
	}
	
	public PatientsDTO getPatientsDTO() {
		return patientsDTO;
	}


}
