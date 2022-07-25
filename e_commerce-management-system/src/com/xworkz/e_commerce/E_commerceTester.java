package com.xworkz.e_commerce;

import java.util.Scanner;

import com.xworkz.e_commerce.crud.E_commerce;
import com.xworkz.e_commerce.crud.impl.E_commerceImpl;
import com.xworkz.e_commerce.dto.OrderDTO;

public class E_commerceTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre the No of item : ");
		int size =sc.nextInt();
		E_commerce ec = new E_commerceImpl(size);
		for(int i=0; i<size;i++)
		{
			System.out.print("Enter the ID of item : ");
			int id = sc.nextInt();
			System.out.print("Enter a Type of the item : ");
			String type = sc.next();
			System.out.print("Enter a Name of the item : ");
			String name = sc.next();
			System.out.print("Enter the cost of item : ");
			int price = sc.nextInt();
			
			OrderDTO odr = new OrderDTO();
			odr.setId(id);
			odr.setType(type);
			odr.setName(name);
			odr.setPrice(price);
			
			ec.shopping(odr);
			
		}
		
		String option=null;
		
	   do
	   {
		    System.out.println("Enter 1 to fetch all the Order details : ");
		    System.out.println("Enter 2 to update Type by Id : ");
		    System.out.println("Enter 3 to delete Order By Name : ");
		    System.out.println("Enter 4 to delete Order By Type : ");
		    System.out.println("Enter 5 to get Order Name By ID : ");
			 System.out.println("Enter 6 to delete Order Type By Name : ");
			 System.out.print("Please enter NO : ");
			 int choise = sc.nextInt();
			 
			 switch(choise)
			 {
				 case 1 : ec.getItem();
				          break;
						  
				 case 2 : System.out.print("Enter the ID of item : ");
			              int existingid = sc.nextInt();
			              System.out.print("Enter a Type of the item : ");
			              String existingtype = sc.next();
			              ec.updateTypeById(existingid, existingtype);
						  break;
						  
	   	         case 3 : System.out.print("Enter the existing Name for delete order: ");
	                      String existingName1 = sc.next();
	                      ec.deleteOrderByName(existingName1);
						  break;
	   	  
		         case 4 : System.out.print("Enter the existing type for delete order: ");
	                      String existingType1 = sc.next();
	                      ec.deleteOrderByType(existingType1);
				 
                 case 5 : System.out.print("Enter the existing ID for Name of the order: ");
	                      int existingId = sc.nextInt();
	                      ec.getOrderNameById(existingId);
 
                 case 6 : System.out.print("Enter the existing Name for Type of the order: ");
	                      String existingTypeForName = sc.next();
	                      ec.getOrderTypeByName(existingTypeForName);
			    default : System.out.print("Wrong option");
                          break;
										  
			 }
			 System.out.print("Do you continue Y/N : ");		  
                option= sc.next();
	   }
	   
	   while(option.equals("Y"));
	   sc.close();
    }
	

	

}
