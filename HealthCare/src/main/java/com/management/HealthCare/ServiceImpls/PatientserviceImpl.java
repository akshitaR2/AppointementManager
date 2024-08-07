package com.management.HealthCare.ServiceImpls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.management.HealthCare.Mappers.MapperConfig;
import com.management.HealthCare.Models.PatientsDTO;
import com.management.HealthCare.Repositories.PatientsRepo;
import com.management.HealthCare.Service.Patientservice;

@Service
public class PatientserviceImpl implements Patientservice{
	
	@Autowired
	PatientsRepo repo;
	
	@Autowired
	MapperConfig mapper;
	
	private static final Logger logger = LoggerFactory.getLogger(PatientserviceImpl.class);
	

	@Override
	public PatientsDTO getPatientInfo(String patient_id) {
		System.out.print(patient_id);
		if (repo.existsByPatientId(patient_id)) {
		PatientsDTO patientsInfoq = mapper.patientsEntitytoDto( repo.findByPatientId(patient_id));
		logger.info("patient info found");
		return patientsInfoq;
		}
		else {
			logger.info("patient info not  found");
		return null;
		}
	}

}
