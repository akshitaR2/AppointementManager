package com.management.HealthCare.Entities;
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
import jakarta.persistence.Version;

@Entity
@Table(name = "patients_list"
//,indexes ={@Index(name = "idx_patient_details", columnList="patientId, contact_info,insurance_info")}
)
public class Patients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sno",nullable = false)
	private Integer sno;
	
	private String patientName;
	private String date_of_birth;
	private String location;
	private int contact_info;
	private String address;
	private String insurance_info;
	private int emergency_contact;
	
	
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	private List<Appointements> appointements;
	
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	private List<MedicalRecords> medicalRecords;
	
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	private List<BillRecords> billings;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "patient_id", referencedColumnName = "uniqueId")
//	private UserEntity user;
	@Column(name = "uniqueid",nullable = false)
	private String patientId;
	
	
	public Patients(String name, String date_of_birth, String gender, int contact_info,
		String address, String insurance_info, int emergency_contact, List<Appointements> appointements,
		List<MedicalRecords> medicalRecords, List<BillRecords> billings, String patientId) {
	super();
	this.patientName = name;
	this.date_of_birth = date_of_birth;
	this.location = gender;
	this.contact_info = contact_info;
	this.address = address;
	this.insurance_info = insurance_info;
	this.emergency_contact = emergency_contact;
	this.appointements = appointements;
	this.medicalRecords = medicalRecords;
	this.billings = billings;
	this.patientId = patientId;
}

	public Patients() {
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

	public int getContact_info() {
		return contact_info;
	}

	public void setContact_info(int contact_info) {
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

	public int getEmergency_contact() {
		return emergency_contact;
	}

	public void setEmergency_contact(int emergency_contact) {
		this.emergency_contact = emergency_contact;
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

	public List<BillRecords> getBillings() {
		return billings;
	}

	public void setBillings(List<BillRecords> billings) {
		this.billings = billings;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	
	
//	 @Version
//	    private Long version;

	
	
}
