package com.management.HealthCare.UserAuthentication;

import java.sql.SQLIntegrityConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import com.management.HealthCare.Entities.Patients;
import com.management.HealthCare.Mappers.MapperConfig;
import com.management.HealthCare.Mappers.UserMapper;
import com.management.HealthCare.Models.RegisterDTO;
import com.management.HealthCare.Repositories.PatientsRepo;

import jakarta.transaction.Transactional;

@Service
public class UserAuthServiceImpl {


	@Autowired
	UserRepo repo;
	
	public Boolean login(UserDto dto) {
		try {
			UserEntity entity = repo.findByUniqueId(dto.getUniqueId());
			if (entity != null)
				return entity.getPassword().matches(dto.getPassword());
			else
				return false;
		} catch (JpaSystemException e) {
			return false;
		}
	}

}
