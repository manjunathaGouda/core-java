class HdfcBank extends Bank1
{
  public void getInterest(double interest)
 {
   System.out.println("The bank is HDFC");
   interest = interest+4.2;
   super.getInterest(interest);
 }
 }
 