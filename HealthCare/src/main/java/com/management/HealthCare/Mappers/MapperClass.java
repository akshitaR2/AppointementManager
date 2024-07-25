//package com.management.HealthCare.Mappers;
//
//import java.util.List;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.management.HealthCare.Entities.Patients;
//import com.management.HealthCare.Models.PatientsDTO;
//import com.management.HealthCare.Repositories.PatientsRepo;
//import com.management.HealthCare.UserAuthentication.UserDto;
//import com.management.HealthCare.UserAuthentication.UserEntity;
//
//@Component
//public class MapperClass {
//
//	 private static ModelMapper modelMapper = new ModelMapper();
//	
//	public List<PatientsDTO> mapToDtoList(List<Patients> patients) {	
//		return patients.stream().map(info->modelMapper.map(info,PatientsDTO.class))
//				.collect(Collectors.toList());
//	}
//	
//	  public PatientsDTO toDto(Patients entity) {
//	    	return modelMapper.map(entity, PatientsDTO.class);
//	    }
//
//	    public Patients toEntity(PatientsDTO dto) {
//	    	return modelMapper.map(dto, Patients.class);
//	    }
//
//}
