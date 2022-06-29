class CanaraBank extends Bank1 {

      @Override
   public void getInterest(double interest) {
  
     System.out.println("The bank is canara");
	 
	 interest = interest+4.2;
	 
	 super.getInterest(interest);
	 
 }
     }
	 
