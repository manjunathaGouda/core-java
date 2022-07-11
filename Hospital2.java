class Hospital2 
 {   
	//Has many patients
	PatientDTO[] dtos;
	
	//instance variable
	int index; 
	
	public Hospital2(int size)  
	{
		 dtos = new PatientDTO[size];
		
		System.out.println("Hospital const is called");
	}
	
	
	public boolean createPatient(PatientDTO dto) 
	{
		System.out.println("inside createPatient");
		boolean isAdded= false;
		if(dto!=null && dto.getName()!=null)
		{
			this.dtos[index++]=dto;
			isAdded = true;
			System.out.println("patient details added sucessfuly");
			System.out.println("..........................");

		}
		else{
			System.out.println("cannot add patient... please add the patient details first");
		}
		return isAdded;
	}	
	
	public void getPatientDetails() {
		System.out.println("inside getPatientDetails()");
		System.out.println("  ");
		for(int i=0; i<dtos.length;i++){
			System.out.println(dtos[i].getId()+" \n "+dtos[i].getName()+" \n "+dtos[i].getAddress()+" \n"+/*dtos[i].getGender()+" \n "+*/dtos[i].getContactNo());
					System.out.println("...........................");

		}
	}
 }
 
	
	
	