package com.management.HealthCare.Models;

public class DoctorsDTO {
	private String doctorId;
	private String docName;
	private String specialty;
	private int contact_info;
	private String location;
	private String department;
	private String address;


	public DoctorsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DoctorsDTO(String doctorId, String docName,  String specialty, int contact_info,
			String location, String department,String address) {
		super();
		this.doctorId = doctorId;
		this.docName = docName;
		this.specialty = specialty;
		this.contact_info = contact_info;
		this.location = location;
		this.department = department;
		this.address=address;
	}


	public String getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
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


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}



}
