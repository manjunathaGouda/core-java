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
		//invoking getPatientDetails();
		hos.getPatientDetails();
		
		/*//invoking updatePatientAdressById ();
		System.out.print("Enter the existing id : ");
		int existingId = sc.nextInt(); 
		System.out.print("Enter the address to be updated : ");
		String updatedAddress = sc.next();
		hos.updatePatientAddressById(existingId,updatedAddress);
		
		//invoking getPatientDetails() again to print updated details.
		hos.getPatientDetails();
		
		
		System.out.print("Enter existing Patient name : ");
		String existingPatientName = sc.next();
		System.out.print("Enter ContactNo to be updated : ");
		long updatedContactNo = sc.nextLong();
		hos.updatePatientContactNoByName(existingPatientName, updatedContactNo);
		
		hos.getPatientDetails();*/
		
		System.out.print("Enter existing Name to be deleted : ");
		String existingName = sc.next();
		
		hos.deletePatientDetailsByName(existingName);
		
		hos.getPatientDetails();
		
		
	}	

}