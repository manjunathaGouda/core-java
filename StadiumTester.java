class StadiumTester
{

	public static void main(String a[])
	{
		
		StadiumDTO s = new StadiumDTO();
		s.setName("Chinnaswamy");
		s.setLocation("Bengaluru");
		s.setEntryFee(2500.00);
		s.setMatch("INDIA vs PAKISTAN");
		s.setSeatNo(101);
		s.setStartOrNot(false);
		
		System.out.println(s.getName()+"\n"+s.getLocation()+"\n"+s.getEntryFee()+"\n"+s.getMatch()+"\n"+s.getSeatNo()+"\n"+s.getStartOrNot());
		//s.watchingMatch();
	}
}