import java.util.Scanner;
class Hospital2Tester 
{
  public static void main(String []a)
  {
	
        Scanner sc = new Scanner(System.in);
	    System.out.println("enter number of patients added");
	    int size = sc.nextInt();
	
	    Hospital2 hos = new Hospital2(size);
	   
	  for(int i=0; i<size;i++)
     {
		   
	   System.out.println("Enter id");
	   int id = sc.nextInt();
	   
	   System.out.println("Enter name");
	   String name = sc.next();
	   
	   System.out.println("Enter address");
	   String address = sc.next();
	   
	   System.out.println("Enter contactNo");
	   long contactNo= sc.nextLong();
	  
	 
	 
		 
	/*  System.out.println("Enter id second patient");
	   int id1 = sc.nextInt();
	   
	   System.out.println("Enter name");
	   String name1 = sc.next();
	   
	   System.out.println("Enter address");
	   String address1 = sc.next();
	   
	   System.out.println("Enter contactNo");
	   long contactNo1= sc.nextLong();
	   
	 Hospital2 hos = new Hospital2(size);    */
	   
	   PatientDTO dto = new PatientDTO();
	   dto.setId(id);
	   dto.setName(name);
	   dto.setAddress(address);
	 //  dto.setGender(Gender.male);
	   dto.setContactNo(contactNo);
	   hos.createPatient(dto);  
	   
	 /*  PatientDTO dto1 = new PatientDTO();
	   dto1.setId(id);
	   dto1.setName(name);
	   dto1.setAddress(address);
	//   dto1.setGender(Gender.male);
	   dto1.setContactNo(contactNo);
	   hos.createPatient(dto1);*/
    }
	   
	 /*  PatientDTO dto2 = new PatientDTO();
	   dto2.setId(2022);
	   dto2.setName("Basu");
	   dto2.setAddress("jayanagar, bengalore");
	 // dto2.setGender(Gender.male);
	   dto2.setContactNo(8245254231L);
	   hos.createPatient(dto2);
	   
	   PatientDTO dto3 = new PatientDTO();
	   dto3.setId(2023);
	   dto3.setName("Sonu");
	   dto3.setAddress("Kalasipalya, bengalore");
	// dto3.setGender(Gender.female);
	   dto3.setContactNo(9045254252L);
	   hos.createPatient(dto3);

	   PatientDTO dto4 = new PatientDTO();
	   dto4.setId(20240);
	   dto4.setName("seethamata");
	   dto4.setAddress("Shivaji nagar, bengalore");
	// dto4.setGender(Gender.female);
	   dto4.setContactNo(9045254252L);
	   hos.createPatient(dto4);   */  
	  
	  hos.getPatientDetails();
  }
}
