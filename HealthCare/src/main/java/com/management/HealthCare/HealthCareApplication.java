package com.management.HealthCare;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.management.HealthCare.Entities.Role;
import com.management.HealthCare.Repositories.RolesRepo;

//import com.management.HealthCare.JWTConfig.RsaKey;

@SpringBootApplication
//@EnableConfigurationProperties(RsaKey.class)
public class HealthCareApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareApplication.class, args);
	}
	
	@Bean
	CommandLineRunner run(RolesRepo roleRepository) {
		return args ->{
			Role adminRole = roleRepository.save(new Role("ADMIN"));
//			roleRepository.save(new Role("USER"));
			Role adminRole2 = roleRepository.save(new Role("USER"));
//			roleRepository.save(new Role("USER"));
			Role adminRole3 = roleRepository.save(new Role("STAFF"));
//			roleRepository.save(new Role("USER"));
			Role adminRole4 = roleRepository.save(new Role("PATIENT"));
			Role adminRole5 = roleRepository.save(new Role("DOCTOR"));
//			roleRepository.save(new Role("USER"));
			
		};
	}

}
