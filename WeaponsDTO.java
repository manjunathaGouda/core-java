class WeaponsDTO
{
	public WeaponsDTO(){
		System.out.println("Weapons object is created");
	}

		  private String name;
		  private double price;
		  private String color;
		  private int noOfBullets;
	

     public String getName()
	 {
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
	 public String getColor()
	 {
	  return color;
     }
     public void setColor(String color)
	 { 
	   this.color=color;
	 }
	 public int getNoOfBullets()
	 {
	  return noOfBullets;
     }
     public void setNoOfBullets(int noOfBullets)
	 { 
	   this.noOfBullets=noOfBullets;
	 }
	/* public void shootingPurpose()
  {
	  System.out.println("for using safety purpose");
  }*/
	
}