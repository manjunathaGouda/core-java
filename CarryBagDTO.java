public class CarryBagDTO
{ 
	public CarryBagDTO(){
		
	}
	
		 // to achieve encapusulation
		 private String name;
		 private double price;
	 
	  //getter and setter
	  public String getName(){
		return name;
	  }
	  
	   public void setName(String name)
	 {
		this.name=name;
	 }
	 
	  public double getPrice()
	{
		return price;
	}
	
	 public void setPrice(double price)
	 {
	 this.price=price;
	 }
	 
	 
	/* public void holdThings(){
		 System.out.println("holds the carrybag");
	 }
	 */
	
	

}