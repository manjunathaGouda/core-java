import java.util.Arrays;

class Hospital {
	
	//has many patients
	PatientDTO[] dtos;
	
	//instance variable
	int index;
	
	public Hospital (int size){
		System.out.println("Welcome to Raksha Hospital");
		dtos = new PatientDTO[size];
	}
	
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
	
	public void getPatientDetails(){
		System.out.println("Inside getPatientDetails() ");
		for(int i = 0; i<dtos.length; i++ ){
			System.out.println(dtos[i].getId()+" "+dtos[i].getName()+" "+dtos[i].getAddress()
			+" "+dtos[i].getGender()+" "+dtos[i].getContactNo() );
		}
	}
	/*public boolean updatePatientAddressById(int id, String address){
		boolean updatedAddress = false;
		System.out.println("updatePatientAddressById() created");
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()== id){
				dtos[i].setAddress(address);
				updatedAddress = true;
			}
			else {
				System.out.println("Entered id does not exist");
			}
		}		
		return updatedAddress;
	}
	
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
				System.out.println("Entered Patient name does not exist");
			}
		}		
		return updatedContactNo;
	}
	
	/*public boolean updatePatientContactNoByAddress(String address, long contactNo){
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
	}*/
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
	
}