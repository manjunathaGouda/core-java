package com.xworkz.hospital.crud.impl;

import java.util.Arrays;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.dto.PatientDTO;
import com.xworkz.hospital.crud.Hospital;

public class HopitalImpl implements Hospital {
	
PatientDTO[] dtos;
	
	//instance variable
	int index;
	
	
	public void HospitalImpl(int size){
		System.out.println("Welcome to punith Hospital");
		dtos = new PatientDTO[size];
	}
	
	@Override
	//CREATE
	public boolean createPatient(PatientDTO dto){
			System.out.println("Inside createPatient() ");
			boolean isAdded = false;
		if(dto!=null && dto.getName()!=null && dto.getId()!=0 && dto.getAddress()!=null 
			&& dto.getGender()!=null  && dto.getContactNo()!=0 ){
				this.dtos[index++] = dto;
				isAdded = true;
				System.out.println("Patient details added succesfully");
	   	}
		else{
			System.out.println("Cannot add patient... please fill correct details");
		}
		return isAdded;
	}
	
	@Override
	public void getPatientDetails(){
		System.out.println("Inside getPatientDetails() ");
		for(int i = 0; i<dtos.length; i++ ){
			System.out.println(dtos[i]);
		}
	}
	
	@Override
	//UPDATE
	public boolean updatePatientAddressById(int id, String address){
		boolean updatedAddress = false;
		System.out.println("updatePatientAddressById() created");
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()== id){
				dtos[i].setAddress(address);
				updatedAddress = true;
			}
			else {
				System.out.println("The patient id is not found");
			}
		}		
		return updatedAddress;
	}
	
	@Override
	public boolean updatePatientContactNoByName(String name, long contactNo){
		boolean updatedContactNo = false;
		System.out.println("updatePatientContactNoByName() invoked");
		for(int i=0; i<dtos.length;i++){
			// "Hitesh" equalsIgnoresCase "hitesh"			equals and equalsIgnoresCase
			if(dtos[i].getName().equals(name) ){
				dtos[i].setContactNo(contactNo);			
				updatedContactNo = true;
			}
			else {
				System.out.println("The patient name is not found");
			}
		}		
		return updatedContactNo;
	}
	
      /*	public boolean updatePatientContactNoByAddress(String address, long contactNo){
		boolean updatedContactNo = false;
		System.out.println("updatePatientContactNoByName() invoked");
		for(int i=0; i<dtos.length;i++){
			if(dtos[i].getAddress()== address){
				dtos[i].setContactNo(contactNo);			
				updatedContactNo = true;
			}
			else {
				System.out.println("Entered Patient address does not exist");
			}
		}		
		return updatedContactNo;
	}            */
	
	@Override
	//DELETE
	public boolean deletePatientDetailsByName(String name){
		System.out.println("deletePatientIdById() invoked");
		boolean deletePatient=false;
		int i,j;
		for( i=0,j=0; j<dtos.length;j++){
			if(!dtos[j].getName().equals(name) ){
				dtos[i++] = dtos[j];
				System.out.println("Patient details deleted succesfully");
			deletePatient = true;
			}
			else {
				System.out.println("Entered name does not exist");
			}
		}
		dtos = Arrays.copyOf(dtos,i);				//utility structure
		return deletePatient;
	}
	@Override
		public boolean deletePatientByContactNo(long contactNo){
			System.out.println("inside deletePatientByContactNo()");
			boolean patientDeletedContact=false;
			int i,j;
			for(i=0,j=0;j<dtos.length;j++){
				if(dtos[j].getContactNo()!=contactNo){
					dtos[i++]=dtos[j];
					patientDeletedContact=true;
				}
				else{
					System.out.println("The patient not found");
				}
			}
			dtos=Arrays.copyOf(dtos,i);
			return patientDeletedContact;
	    }
	
	@Override
		public String getPatientNameById(int id){
		String patientName=null;
		for (int i=0;i<dtos.length;i++){
	       if(dtos[i].getId()==id){
		   patientName=dtos[i].getName();
	       }
		   else{
			System.out.println("The patient id not found");
		   }
		}
    
	return patientName;
	
   }
	
	@Override
   public long getPatientContactNoByName(String name){
	   long patientContactNo=0;
	   for(int i=0;i<dtos.length;i++){
		   if(dtos[i].getName().equals(name)){
			patientContactNo=dtos[i].getContactNo();
		   }
		   else{
			   System.out.println("The name is not matched");
		   }
	   }
	   return patientContactNo;
   }
	
	@Override
   public boolean deletePatientDetailsByGender(Gender gender){
	   boolean patientDeleted = false;
	   System.out.println("inside deletePatientDetailsByGender()");
	   int i,j;
	   for(i=0,j=0;j<dtos.length;j++){
		   if(dtos[j].getGender()!=gender){
			   dtos[i++]=dtos[j];
			   patientDeleted = true;
		   }
		   else{
			   System.out.println("the patient is not available");
		   }
	   }
	   dtos=Arrays.copyOf(dtos,i);
	   
	   return patientDeleted;
   }
}

