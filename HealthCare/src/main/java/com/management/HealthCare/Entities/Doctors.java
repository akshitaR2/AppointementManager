package com.management.HealthCare.Entities;

import java.time.LocalTime;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctors_list",indexes = {@Index(name=" idx_availableDoc",columnList = "department,location")})
public class Doctors {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "sno",nullable = false)
	private Integer sno;
	@Column(name = "uniqueid",nullable = false)
	private String doctorsId;
	private String docName;
	private String specialty;
	private int contact_info;
	private String location;
	private String address;
	private String department;
	
	
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
	private List<Appointements> appointements;
	
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
	private List<MedicalRecords> medicalRecords ;
	
	private int office_hours;
	private LocalTime workStartTime = LocalTime.of(10, 0);
	private LocalTime workEndTime = LocalTime.of(12, 0);

	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	public Doctors(String doctorId, String docName,  String specialty, int contact_info,
//			String location, String department,String address) {
//		super();
//		this.doctorsId = doctorId;
//		this.docName = docName;
//		this.specialty = specialty;
//		this.contact_info = contact_info;
//		this.location = location;
//		this.department = department;
//		this.address=address;
//	}
	

public Doctors(String doctorsId, String docName, String specialty, int contact_info, String location, String address,
		String department, List<Appointements> appointements, List<MedicalRecords> medicalRecords, int office_hours,
		LocalTime workStartTime, LocalTime workEndTime) {
	super();
	this.doctorsId = doctorsId;
	this.docName = docName;
	this.specialty = specialty;
	this.contact_info = contact_info;
	this.location = location;
	this.address = address;
	this.department = department;
	this.appointements = appointements;
	this.medicalRecords = medicalRecords;
	this.office_hours = office_hours;
	this.workStartTime = workStartTime;
	this.workEndTime = workEndTime;
}

public String getDoctorsId() {
	return doctorsId;
}

public void setDoctorsId(String doctorsId) {
	this.doctorsId = doctorsId;
}

public String getDocName() {
	return docName;
}

public void setDocName(String docName) {
	this.docName = docName;
}

public String getSpecialty() {
	return specialty;
}

public void setSpecialty(String specialty) {
	this.specialty = specialty;
}

public int getContact_info() {
	return contact_info;
}

public void setContact_info(int contact_info) {
	this.contact_info = contact_info;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public List<Appointements> getAppointements() {
	return appointements;
}

public void setAppointements(List<Appointements> appointements) {
	this.appointements = appointements;
}

public List<MedicalRecords> getMedicalRecords() {
	return medicalRecords;
}

public void setMedicalRecords(List<MedicalRecords> medicalRecords) {
	this.medicalRecords = medicalRecords;
}

public int getOffice_hours() {
	return office_hours;
}

public void setOffice_hours(int office_hours) {
	this.office_hours = office_hours;
}

public LocalTime getWorkStartTime() {
	return workStartTime;
}

public void setWorkStartTime(LocalTime workStartTime) {
	this.workStartTime = workStartTime;
}

public LocalTime getWorkEndTime() {
	return workEndTime;
}

public void setWorkEndTime(LocalTime workEndTime) {
	this.workEndTime = workEndTime;
}




}
