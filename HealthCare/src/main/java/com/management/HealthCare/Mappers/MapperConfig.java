package com.management.HealthCare.Mappers;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.management.HealthCare.Entities.Appointements;
import com.management.HealthCare.Entities.Doctors;
import com.management.HealthCare.Entities.Patients;
import com.management.HealthCare.Models.AppointmentDTO;
import com.management.HealthCare.Models.DoctorsDTO;
import com.management.HealthCare.Models.PatientsDTO;
import com.management.HealthCare.UserAuthentication.UserDto;
import com.management.HealthCare.UserAuthentication.UserEntity;

@Component
public class MapperConfig {
	 private static ModelMapper modelMapper = new ModelMapper();
		
	 public List<PatientsDTO> patientsEntityMapToDtoList(List<Patients> patients) {	
			return patients.stream().map(info->modelMapper.map(info,PatientsDTO.class))
					.collect(Collectors.toList());
		}
		
		  public PatientsDTO patientsEntitytoDto(Patients entity) {
		    	return modelMapper.map(entity, PatientsDTO.class);
		    }

		    public Patients patientsDTOtoEntity(PatientsDTO dto) {
		    	return modelMapper.map(dto, Patients.class);
		    }
		
		  public DoctorsDTO doctorsEntitytoDto(Doctors entity) {
		    	return modelMapper.map(entity, DoctorsDTO.class);

		    }

		    public Doctors doctorsDTOtoEntity(DoctorsDTO dto) {
		    	
		    	return modelMapper.map(dto,Doctors.class);
		    }
	
		    public UserDto userEntitytoDto(UserEntity entity) {
		    	UserDto dto = new UserDto();
		        dto.setUsername(entity.getUsername());
		        dto.setEmailId(entity.getEmailId());
		        dto.setUniqueId(entity.getUniqueId());
		        return dto;
		    }

		    public UserEntity userDtotoEntity(UserDto dto) {
		    	UserEntity entity = new UserEntity();
		    	entity.setEmailId(dto.getEmailId());
		    	entity.setPassword(dto.getPassword());
		    	entity.setUniqueId(dto.getUniqueId());
		    	entity.setUsername(dto.getUsername());
		    	entity.setRole(dto.getRole());
		        return entity;
		    }
		    
		    public AppointmentDTO AppointementEntitytoDTO(Appointements entity) {
		    	AppointmentDTO dto=new AppointmentDTO();
		    	dto.setDoctorAddress(entity.getDoctor().getAddress());
				dto.setDoctorName(entity.getDoctor().getDocName());
				dto.setStartdate(entity.getStartTime());
				dto.setStatus(entity.getStatus());
				dto.setReason(entity.getReason());
				dto.setStatus(entity.getStatus());
		    	return dto;

		    }
		    
		    public AppointmentDTO AppointementEntitytoDocAppDto(Appointements entity) {
		    	AppointmentDTO dto=new AppointmentDTO();
		    	dto.setPatientId(entity.getPatient().getPatientId());
		    	dto.setPatient_address(entity.getPatient().getAddress());
		    	dto.setPatients_name(entity.getPatient().getPatientName());
		    	dto.setReason(entity.getReason());
		    	dto.setStatus(entity.getStatus());
		    	dto.setStartdate(entity.getStartTime());
		    	dto.setPatients_contact_info(entity.getPatient().getContact_info());
		    	return dto;

		    }
		    
	
		  
}
