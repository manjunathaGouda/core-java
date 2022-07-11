import java.util.Scanner;

class HotelTester{
	
	  public static void main(String a[]){
	    
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of FoodItem");
	 int size = sc.nextInt();
	 
	 Hotel ht = new Hotel(size);
	 
	 for(int i=0; i<size;i++){
		 
    FoodItemDTO dto = new FoodItemDTO();
	
	System.out.println("Enter the FoodItem id ");
	int id = sc.nextInt();
	
	System.out.println("Enter the FoodItem name");
	String name = sc.next();
	
	System.out.println("Enter the FoodItem type");
	String type = sc.next();
	
	System.out.println("Enter the FoodItem price");
	int price = sc.nextInt();
	
   dto.setId(id);
   dto.setName(name);
   dto.setType(type);
   dto.setPrice(price);
   ht.createFoodItems(dto);
   }
   ht.getFoodItemsDetails();
   }

}