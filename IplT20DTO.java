public class IplT20DTO
{
	public IplT20DTO(){
		System.out.println("IplT20 object is created");
	}
			  private String name;
			  private String location;
			  private double entryFee;
			  private String match;
			  private int seatNo;
			  private boolean startOrNot;
			  
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
	 
	 public double getEntryFee()
	 {
		 return entryFee;
	 }
	 public void setEntryFee(double entryFee)
	 {
		 this.entryFee=entryFee;
	 }
	 
	 public String getMatch()
	 {
		 return match;
	 }
	 public void setMatch(String match)
	 {
		 this.match=match;
	 }
	 
	 public int getSeatNo()
	 {
		 return seatNo;
	 }
	 public void setSeatNo(int seatNo)
	 {
		 this.seatNo=seatNo;
	 }
	 public boolean getStartOrNot()
	 {
		 return startOrNot;
	 }
		public void setStartOrNot(boolean StartOrNot)
		{
			this.startOrNot=startOrNot;
		}
  /*    public void watchingMatch()
  {
	  System.out.println("IPL match nodoke maja barutthe");
  }*/
	
}