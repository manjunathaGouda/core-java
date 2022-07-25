package com.xworkz.e_commerce.crud;

import com.xworkz.e_commerce.dto.OrderDTO;

public interface E_commerce {

	public boolean shopping(OrderDTO odr);
	public void getItem();
	public boolean updateTypeById(int id , String type);
	public boolean deleteOrderByType(String type);
	public boolean deleteOrderByName(String name);
	public String getOrderNameById(int id);
	public String getOrderTypeByName(String name);
	
}
