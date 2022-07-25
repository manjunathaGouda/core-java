package com.xworkz.airport.crud;

import com.xworkz.airport.dto.TerminalDTO;

public interface Airport {
	
	public boolean terminals(TerminalDTO td);
	public void getTerminalDetails();
	public boolean updateNamesById(int id,String airportName);
	public boolean deleteByType(String type);
	public boolean deleteByAirportName(String airportName);
	
}
