class AxisBank extends Bank1 {

   @Override
   public void getInterest(double interest) {
   System.out.println("The bank is Axis");
   interest = interest + 5.2;
   
   super.getInterest(interest);
   
   }
   }
   