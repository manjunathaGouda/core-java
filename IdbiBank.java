class IdbiBank extends Bank1{

   public void getInterest(double interest) {
 
   System.out.println("The bank is IDBI");
   interest=interest+4.2;
   super.getInterest(interest);
   
   }
   }
   