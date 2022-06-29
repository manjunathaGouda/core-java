class KotakBank extends Bank1 {

    @Override
	public void getInterest(double interest) {
    System.out.println("The kotak bank");
      interest = interest + 3.2;

     super.getInterest(interest);

}
}
	 