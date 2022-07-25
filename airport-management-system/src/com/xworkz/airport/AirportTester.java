package com.xworkz.airport;

import java.util.Scanner;

import com.xworkz.airport.crud.Airport;
import com.xworkz.airport.crud.impl.AirportImpl;
import com.xworkz.airport.dto.TerminalDTO;

public class AirportTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("terminals");
		int size = sc.nextInt();
		
		Airport a1 = new AirportImpl(size);
		for(int i=0;i<size;i++){
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter type");
		String type = sc.next();
		System.out.println("enter Airport Name");
		String airportName = sc.next();
		System.out.println("no of entry");
		int noOfEntry = sc.nextInt();
		System.out.println("no of exit");
		int noOfExit = sc.nextInt();
		
		
		TerminalDTO td = new TerminalDTO();
		td.setId(id);
		td.setType(type);
		td.setAirportName(airportName);
		td.setNoOfEntry(noOfEntry);
		td.setNoOfExit(noOfExit);
		
		a1.terminals(td);
						
		}
		String option=null;
		do{
			System.out.println("Enter 1 to fetch terminal details");
			System.out.println("Enter 2 to update terminal details");
			System.out.println("Enter 3 to delete terminal details by type");
			System.out.println("Enter 4 to delete terminala details by name");
			
			
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			
		switch(choice){
			case 1 : a1.getTerminalDetails();
			         break;
					 
			case 2 : System.out.println("enter existing id");
		             int existingId = sc.nextInt();
		             System.out.println("enter new name");
		             String updatedName = sc.next();
		             a1.updateNamesById(existingId,updatedName);
					 break;
					 
			case 3 : System.out.println("enter type");
		             String type1=sc.next();
					 a1.deleteByType(type1);
					 break;
				
					 
			case 4 : System.out.println("enter name");
		             String name=sc.next();
		             a1.deleteByAirportName(name);
					 break;
					 
					 
			default : System.out.println("Enter the proper number");
			         break;
				
		}	
		System.out.println("Do you want to continue Y/N");				
			option = sc.next();
		}
		while(option.equals("Y"));
		
		
		
		
		
		sc.close();
	}



}
