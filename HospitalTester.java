import java.util.Scanner;

class HospitalTester {
	
	public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter No of Patients :");
		int size = sc.nextInt();
		Hospital hos = new Hospital(size);
			for(int i=0; i<size; i++){
		System.out.print("Enter Patient's Name :");
		String name = sc.next();
		System.out.print("Enter Patient's Id :");
		int id = sc.nextInt();
		System.out.print("Enter Patient's Address :");
		String address = sc.next();
		System.out.print("Patient's Contact No :");
		long contactNo = sc.nextLong();
		System.out.print("Patients gender :");
		String gender = sc.next();
		
		PatientDTO dto = new PatientDTO(); 
		dto.setId(id);
		dto.setName(name);
		dto.setAddress(address);
		dto.setGender(Gender.valueOf(gender) );
		dto.setContactNo(contactNo);
		hos.createPatient(dto);
	}				
	
		String option= null;
		do {
			System.out.println("Enter 1 to fetch all the patients");
			System.out.println("Enter 2 to updatePatientAddressById");
			System.out.println("Enter 3 to updatePatientContactNoByName");
			System.out.println("Enter 4 to deletePatientDetailsByName");
			int choise = sc.nextInt();
			
			switch(choise){
				case 1 : hos.getPatientDetails();
				break;
				 
				case 2 :    System.out.print("Enter the existing id : ");
							int existingId = sc.nextInt(); 
							System.out.print("Enter the address to be updated : ");
							String updatedAddress = sc.next();
							hos.updatePatientAddressById(existingId,updatedAddress);
							break;
							
				case 3 :   System.out.print("Enter existing Patient name : ");
							String existingPatientName = sc.next();
							System.out.print("Enter ContactNo to be updated : ");	
							long updatedContactNo = sc.nextLong();
							hos.updatePatientContactNoByName(existingPatientName, updatedContactNo);
							break;
							
				case 4 : 	System.out.print("Enter existing Name to be deleted : ");
							String existingName = sc.next();
							hos.deletePatientDetailsByName(existingName);
							
				case 5 :  System.out.println("enter the contact no to delete patient details");
		                      long contactNo1 = sc.nextLong();
		                      hos.deletePatientByContactNo(contactNo1);
							  break ;
			   case 6 :      System.out.println("enter the id to get name");
                              int existingId1 = sc.nextInt();
                              System.out.println(hos.getPatientNameById(existingId1));	
							  break;
               case 7 :      System.out.println("enter the existing name to get contact number");
                              String exstingName = sc.next();
                              System.out.println(hos.getPatientContactNoByName(exstingName));
							  break ;
              case 8 :       System.out.println("Enter the Gender to delete patient details");
		                     String ge1 = sc.next();
		                     hos.deletePatientDetailsByGender(Gender.valueOf(ge1));
							  break ;
								
				default : System.out.println("Given choise cannot be delivered");
				break;
				
				
			}
				System.out.println("Do you want to continue y/n");
				option = sc.next();
			
			
		}while(option.equals("y"));			
							

			
			
			
			
			
		//invoking getPatientDetails();
		
      /*   invoking updatePatientAdressById ();
		System.out.print("Enter the existing id : ");
		int existingId = sc.nextInt(); 
		System.out.print("Enter the address to be updated : ");
		String updatedAddress = sc.next();
		hos.updatePatientAddressById(existingId,updatedAddress);
		
	   // invoking getPatientDetails() again to print updated details.
		hos.getPatientDetails();
		
		
		System.out.print("Enter existing Patient name : ");
		String existingPatientName = sc.next();
		System.out.print("Enter ContactNo to be updated : ");	
		long updatedContactNo = sc.nextLong();
		hos.updatePatientContactNoByName(existingPatientName, updatedContactNo);
		
		hos.getPatientDetails();
		
		System.out.print("Enter existing Name to be deleted : ");
		String existingName = sc.next();
		
		hos.deletePatientDetailsByName(existingName);
		
		hos.getPatientDetails();   */
		
		
	}	

}