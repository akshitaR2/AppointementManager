package com.management.HealthCare.Mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.management.HealthCare.UserAuthentication.UserDto;
import com.management.HealthCare.UserAuthentication.UserEntity;

@Component
public class UserMapper {
	
	
    public UserDto toDto(UserEntity entity) {
    	UserDto dto = new UserDto();
        dto.setUsername(entity.getUsername());
        dto.setEmailId(entity.getEmailId());
        dto.setUniqueId(entity.getUniqueId());
        return dto;
    }

    public UserEntity toEntity(UserDto dto) {
    	UserEntity entity = new UserEntity();
    	entity.setEmailId(dto.getEmailId());
    	entity.setPassword(dto.getPassword());
    	entity.setUniqueId(dto.getUniqueId());
    	entity.setUsername(dto.getUsername());
    	entity.setRole(dto.getRole());
        return entity;
    }

}
