package com.management.HealthCare.Service;

import com.management.HealthCare.Models.DoctorsDTO;
import com.management.HealthCare.Models.RegisterDTO;
import com.management.HealthCare.UserAuthentication.UserDto;

public interface StaffRegisterService {

	String addDoctor(RegisterDTO dto);

	Boolean addPatient(RegisterDTO dto);

	Boolean addUser(UserDto dto);

}
