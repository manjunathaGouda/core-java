class SeethaBank extends Bank1 {

 public void getInterest(double interest){
  System.out.println("The bank is Seetha");
  
  interest = interest+3.2;
  super.getInterest(interest);
  
 }
 }