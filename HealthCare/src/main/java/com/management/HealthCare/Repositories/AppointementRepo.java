package com.management.HealthCare.Repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.management.HealthCare.Entities.Appointements;
import com.management.HealthCare.Entities.Doctors;

@Repository
public interface AppointementRepo extends JpaRepository<Appointements, Integer> {

	List<Appointements> findByDoctorAndStartTimeBetween(Doctors doc, LocalDateTime of, LocalDateTime of2);

	@Query(value = "select * from appointements where patient_uniqueid = :patient_id ",nativeQuery = true)
	List<Appointements> findAllByPatientId(@Param("patient_id")String patient_id);

	@Query(value = "select * from appointements where doctor_uniqueid = :doctors_id ",nativeQuery = true)
	List<Appointements> findAllByDoctorId(@Param("doctors_id")String doctors_id);

	@Query(value = "select * from appointements where  patient_uniqueid = :patient_id AND status = :status ",nativeQuery = true)
	List<Appointements> findAllByPatientIdAndStatus(@Param("patient_id")String patient_id,@Param("status") String status);

//	boolean existsByPatientId(String patient_id);
//	
//	 @Query(value = "SELECT a.* FROM appointments a " +
//             "JOIN doctors d ON a.doctor_id = d.id " +
//             "WHERE d.id IN (:doctorIds) " +
//             "AND d.city = :city " +
//             "AND d.department = :department " +
//             "AND a.start_time >= :startDate", nativeQuery = true)
//List<Appointment> findAppointmentsByDoctorCriteriaNative(
//  @Param("doctorIds") List<Long> doctorIds, 
//  @Param("city") String city, 
//  @Param("department") String department, 
//  @Param("startDate") LocalDateTime startDate);
	
	
	
//    @Query("SELECT a FROM Appointment a WHERE a.doctor.id IN :doctorIds AND a.doctor.city = :city AND a.doctor.department = :department AND a.startTime >= :startDate")
//    List<Appointment> findAppointmentsByDoctorCriteria(
//        @Param("doctorIds") List<Long> doctorIds, 
//        @Param("city") String city, 
//        @Param("department") String department, 
//        @Param("startDate") LocalDateTime startDate);


}
