class BankOfIndia extends Bank1 {

  public void getInterest(double interest) {
 
  System.out.println("The bank is Bank Of India");
  
  interest = interest+4.2;
  super.getInterest(interest);
  
  }
  }
  