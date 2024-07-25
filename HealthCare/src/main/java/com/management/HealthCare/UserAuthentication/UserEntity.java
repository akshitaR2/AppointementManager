package com.management.HealthCare.UserAuthentication;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user_auth_details")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
//	@ManyToOne
//    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
//    private Role role;
	private String role;
	private String username;
	private String password;
	
	@Column(name = "uniqueId", unique = true,nullable = false)
	private String uniqueId;
	
	private String emailId;
	
	public UserEntity() {
		super();
	}
	
	
	public UserEntity(String role, String username, String password, String uniqueId, String emailId) {
		super();
		this.role = role;
		this.username = username;
		this.password = password;
		this.uniqueId = uniqueId;
		this.emailId = emailId;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}
