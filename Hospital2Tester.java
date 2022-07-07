class Hospital2Tester 
{
  public static void main(String []a)
  {
	   Hospital2 hos = new Hospital2();
	   
	   PatientDTO dto = new PatientDTO();
	   dto.setId(2020);
	   dto.setName("Baba");
	   dto.setAddress("Rajajinagar bengalore");
	   dto.setGender(Gender.male);
	   dto.setContactNo(7852545279L);
	   hos.createPatient(dto);
	   
	   PatientDTO dto1 = new PatientDTO();
	   dto1.setId(2021);
	   dto1.setName("Ram");
	   dto1.setAddress("Malleshwaram bengalore");
	   dto1.setGender(Gender.male);
	   dto1.setContactNo(9852545279L);
	   hos.createPatient(dto1);
	   
	   PatientDTO dto2 = new PatientDTO();
	   dto2.setId(2022);
	   dto2.setName("Basu");
	   dto2.setAddress("jayanagar, bengalore");
	   dto2.setGender(Gender.male);
	   dto2.setContactNo(8245254231L);
	   hos.createPatient(dto2);
	   
	   PatientDTO dto3 = new PatientDTO();
	   dto3.setId(2023);
	   dto3.setName("Sonu");
	   dto3.setAddress("Kalasipalya, bengalore");
	   dto3.setGender(Gender.female);
	   dto3.setContactNo(9045254252L);
	   hos.createPatient(dto3);

	   PatientDTO dto4 = new PatientDTO();
	   dto4.setId(20240);
	   dto4.setName("shambu");
	   dto4.setAddress("Shivaji nagar, bengalore");
	   dto4.setGender(Gender.female);
	   dto4.setContactNo(9045254252L);
	   hos.createPatient(dto4);
	  
	  hos.getPatientDetails();
  }
}
