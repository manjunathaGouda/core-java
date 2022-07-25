package com.xworkz.airport.dto;

import lombok.Data;          //anotation

@Data



public class TerminalDTO {

	public TerminalDTO() {
	}
	
	private int id;
	private String type;
	private String airportName;
	private int noOfEntry;
	private int noOfExit;
	
	
}
	
