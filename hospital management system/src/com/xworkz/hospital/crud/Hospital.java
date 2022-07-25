package com.xworkz.hospital.crud;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.dto.PatientDTO;

public interface Hospital {
	
/*	public Hospital (int size);	*/
	public boolean createPatient(PatientDTO dto);
	public void getPatientDetails();
	public boolean updatePatientAddressById(int id, String address);
	public boolean updatePatientContactNoByName(String name, long contactNo);
	public boolean deletePatientDetailsByName(String name);
	public boolean deletePatientByContactNo(long contactNo);
	public long getPatientContactNoByName(String name);
	public boolean deletePatientDetailsByGender(Gender gender);
	public String getPatientNameById(int id);
}
