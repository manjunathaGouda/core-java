class AirportTester
{
	public static void main(String a[])
	{
		
		Airport p = new Airport();
		p.setName("Kempegowda International Airport");
		p.setLocation("Bengaluru");
		p.setType("International");
		
		System.out.println(p.getName()+":"+p.getLocation()+":"+p.getType());
		p.passportTicketAvailable();
	}
	
	
}