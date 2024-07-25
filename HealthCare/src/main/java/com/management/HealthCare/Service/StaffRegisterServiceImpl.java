package com.management.HealthCare.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.management.HealthCare.Entities.Doctors;
import com.management.HealthCare.Entities.Patients;
import com.management.HealthCare.Mappers.MapperConfig;
import com.management.HealthCare.Models.DoctorsDTO;
import com.management.HealthCare.Models.RegisterDTO;
import com.management.HealthCare.Repositories.DoctorsRepo;
import com.management.HealthCare.Repositories.PatientsRepo;
import com.management.HealthCare.UserAuthentication.UserAuthController;
import com.management.HealthCare.UserAuthentication.UserDto;
import com.management.HealthCare.UserAuthentication.UserEntity;
import com.management.HealthCare.UserAuthentication.UserRepo;

@Service
public class StaffRegisterServiceImpl implements StaffRegisterService {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	AuditLogService auditService;

	@Autowired
	MapperConfig mapper;
	
	@Autowired
	PatientsRepo patRepo;

	@Autowired
	DoctorsRepo doctorsRepo;


	private static final Logger logger = LoggerFactory.getLogger(UserAuthController.class);
	
	
	@Override
	@Transactional
	public String addDoctor(RegisterDTO dto) {
		if (userRepo.existsByUniqueId(dto.getUserDto().getUniqueId()))
			return "already exists";
		else {
			try {
				
				userRepo.save(mapper.userDtotoEntity(dto.getUserDto()));
				Doctors doc=mapper.doctorsDTOtoEntity(dto.getDoctorsDTO());
//				doc.setDepartmentId(dto.getDoctorsDTO().getDepartment());
				doctorsRepo.save(doc);
				auditService.logAction("user,doctor", "entity", "add",null,"userid");
				logger.info("new user added - doctor");
				return "Doctor details added";
			} catch (Exception e) {
				logger.error("Error occurred while performing action", e);
				 throw e;
			}
		}
	}

	@Override
	@Transactional
	public Boolean addPatient(RegisterDTO dto) {
		
			try {
				
				if (userRepo.existsByUniqueId(dto.getUserDto().getUniqueId()))
					return false;
				else {
					UserEntity entity = mapper.userDtotoEntity(dto.getUserDto());
					Patients patients= mapper.patientsDTOtoEntity(dto.getPatientsDTO());
					userRepo.save(entity);
					patRepo.save(patients);
					auditService.logAction("user,doctor", "entity", "add",null,"userid");
					logger.info("new user added -patient");
					return true;
				}
			} catch (Exception e) {
				logger.error("Error occurred while performing action", e);
				throw e;
			}
		
	}

	@Override
	public Boolean addUser(UserDto dto) {
		try {
			if (userRepo.existsByUniqueId(dto.getUniqueId())) {
				logger.info("register user declines since user already exist");
				return false;
			}
			else {
				UserEntity entity = mapper.userDtotoEntity(dto);
				userRepo.save(entity);
				auditService.logAction("user", "entity", "add",null,"userid");
				logger.info("new user added ");
				return true;
			}
		} catch (Exception e) {

			logger.error("Error occurred while performing action", e);
			throw e;
		}
	}
	
	
	

}
