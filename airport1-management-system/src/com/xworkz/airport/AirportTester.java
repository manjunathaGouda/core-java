package com.xworkz.airport;

import com.xworkz.airport.dto.AirportDTO;

public class AirportTester {

	public static void main(String[] args) {
		 AirportDTO ap=new AirportDTO();
		  ap.setId(001);
		  ap.setName("Kempegouda international airport");
		  ap.setType("International airport");
		  ap.setNoOfTerminals(1);
		  ap.setNoOfRunways(2);
		  ap.toTravelFaster();
		  
		  System.out.println(ap.getId() + " " + ap.getName() + " " + ap.getType() + " " + ap.getNoOfTerminals() + 
		                         " " + ap.getNoOfRunways());

	}

}
