package com.management.HealthCare.Models;


public class PatientsDTO {
	
	private String patientName;
	private String date_of_birth;
	private String location ;
	private String contact_info ;
	private String address ;
	private String insurance_info ;
	private String emergency_contact ;
//	private String appointements ;
//	private String medicalRecords ;
//	private String billings ;
	private String patientId ;
	
	
	
//	public PatientsDTO(String first_name, String last_name, String date_of_birth, String gender, String contact_info,
//			String address, String insurance_info, String emergency_contact, String appointements,
//			String medicalRecords, String billings, String patientId) {
//		super();
//		this.first_name = first_name;
//		this.last_name = last_name;
//		this.date_of_birth = date_of_birth;
//		this.gender = gender;
//		this.contact_info = contact_info;
//		this.address = address;
//		this.insurance_info = insurance_info;
//		this.emergency_contact = emergency_contact;
//		this.appointements = appointements;
//		this.medicalRecords = medicalRecords;
//		this.billings = billings;
//		this.patientId = patientId;
//	}
	
	
	public PatientsDTO(String patientName, String contact_info, String address,
			 String patient_id) {
		super();
		this.patientName=patientName;
		this.contact_info = contact_info;
		this.address = address;
		this.patientId = patient_id;
	}

	public PatientsDTO(String patientName, String date_of_birth, String location, String contact_info,
		String address, String insurance_info, String emergency_contact, String patientId) {
	super();
	this.patientName = patientName;
	this.date_of_birth = date_of_birth;
	this.location = location;
	this.contact_info = contact_info;
	this.address = address;
	this.insurance_info = insurance_info;
	this.emergency_contact = emergency_contact;
	this.patientId = patientId;
}

	public PatientsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContact_info() {
		return contact_info;
	}

	public void setContact_info(String contact_info) {
		this.contact_info = contact_info;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getInsurance_info() {
		return insurance_info;
	}

	public void setInsurance_info(String insurance_info) {
		this.insurance_info = insurance_info;
	}

	public String getEmergency_contact() {
		return emergency_contact;
	}

	public void setEmergency_contact(String emergency_contact) {
		this.emergency_contact = emergency_contact;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	
	
	
	

}
