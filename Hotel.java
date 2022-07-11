class Hotel{
	
    FoodItemDTO[] dtos;
	  int index;
	
	  public Hotel(int size){
		
		dtos = new FoodItemDTO[size];
		System.out.println("Hotel constructor is called");
	 }


      public boolean createFoodItems(FoodItemDTO dto){
		  System.out.println("inside the create types of foodItems");
		  
		  boolean isAdded = false;
		  if(dto != null && dto.getName() != null){
		   this.dtos[index++] = dto;
		   isAdded = true;
		   System.out.println("The foodItems detail is added");
		   
		  }
		  
		  else{
			  System.out.println(" The required foodItems is not here");
		  }
		  
		   return isAdded;
	  }

    public void getFoodItemsDetails(){
		System.out.println("inside the getFoodItemsDetails");
		
		for(int i=0; i<dtos.length;i++){
			
			System.out.println(dtos[i].getId()+"  "+dtos[i].getName()+"  "+dtos[i].getType()+"  "+dtos[i].getPrice());
		}
		
		
		
	}
}