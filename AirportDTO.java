class AirportDTO
{
public AirportDTO(){
		System.out.println("Airport object is created");
	}
		  private String name;
		  private String location;
		  private String type;
		  private boolean taxiLane ;
		  private int avrgFlightLanding;

     public String getName()
	 {
	  return name;
     }
     public void setName(String name)
	 { 
	   this.name=name;
	 }
	 
	 public String getLocation()
	 {
		 return location;
	 }
	 public void setLocation(String location)
	 {
		 this.location=location;
	 }
	 
	 public String getType()
	 {
		 return type;
	 }
	 public void setType(String type)
	 {
		 this.type=type;
	 }
	 
	 
 /* public void passportTicketAvailable()
  {
	  System.out.println("Flying in the sky");
  }*/
	
}