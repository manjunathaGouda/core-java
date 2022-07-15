class TerminalDTO{

   public TerminalDTO(){
   }
   
   private int id;
   private String type;
   private String airportName;
   private int noOfEntry;
   private int noOfExit;
   
   
  public int getId(){
	  return id;
  }
  public void setId(int id){
	  this.id=id;
  }
  
  public String getType(){
	  return type;
  }
  public void setType(String type){
	  this.type=type;
  }
  
  public String getAirportName(){
	  return airportName;
  }
  public void setAirportName(String airportName){
	  this.airportName=airportName;
  }
  
  public int getNoOfEntry(){
	  return noOfEntry;
  }
  public void setNoOfEntry(int noOfEntry){
	  this.noOfEntry=noOfEntry;
  }
  public int getNoOfExit(){
	  return noOfExit;
  }
  public void setNoOfExit(int noOfExit){
	  this.noOfExit=noOfExit;
  }

}