package com.xworkz.hotel.crud;

import com.xworkz.hotel.dto.FoodDTO;

public interface Hotel {

	public boolean foodMenu(FoodDTO dto);
	public void getMenu();
	public boolean updateNamesById(int id,String name);
	public boolean updatePriceByName(String name,int price);
	public boolean deleteByName(String name);
	public boolean deleteByType(String type);
	public String getFoodNameById(int id);
	
}
