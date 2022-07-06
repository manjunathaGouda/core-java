class IplT20Tester
{

	public static void main(String a[])
	{
		
		Stadium s = new Stadium();
		s.setName("Chinnaswamy");
		s.setLocation("Bengaluru");
		s.setEntryFee(2500.00);
		s.setMatch("RCB vs CSK");
		s.setSeatNo(120);
		s.setStartOrNot(false);
		
		System.out.println(s.getName()+"\n"+s.getLocation()+"\n"+s.getEntryFee()+"\n"+s.getMatch()+"\n"+s.getSeatNo()+"\n"+s.getStartOrNot());
		s.watchingMatch();
	}
}