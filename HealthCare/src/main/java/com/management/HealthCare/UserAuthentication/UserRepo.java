package com.management.HealthCare.UserAuthentication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {

	UserEntity findByUniqueId(String uniqueId);

	boolean existsByUniqueId(String uniqueId);

	
}
