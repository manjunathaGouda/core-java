class BankOfBaroda extends Bank1 {

 public void getInterest(double interest){
 System.out.println("The bank is Bank Of Baroda");
 
 interest = interest+3.5;
 super.getInterest(interest);
 }
 }
 