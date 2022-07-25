package com.xworkz.hotel.crud.impl;

import java.util.Arrays;

import com.xworkz.hotel.crud.Hotel;
import com.xworkz.hotel.dto.FoodDTO;

public class HotelImpl implements Hotel {

	FoodDTO[] dtos;
	int fi;
	
	
	public HotelImpl(int size){
		dtos=new FoodDTO[size];
		System.out.println("Constructor created");
	}
	
	
	public boolean foodMenu(FoodDTO dto){
		
		boolean addFood=false;
      if(dto!=null){
		  this.dtos[fi++]=dto;
	       addFood=true;
		   System.out.println("Food added to menu");
		  
	  }	
     else {
		 System.out.println("Add it correctly");
	 }
     return addFood;	 
		
	}
  
  public void getMenu(){
	  for (int i=0;i<dtos.length;i++){
		  System.out.println(dtos[i].getId()+":"+dtos[i].getType()+":"+dtos[i].getName()+":"+dtos[i].getPrice());
	  }
  }
  
  public boolean updateNamesById(int id,String name){
		System.out.println("inside updateName");
		   boolean updatedName=false;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()==id){
				dtos[i].setName(name);
				updatedName=true;
				System.out.println("updated successfully");
			}
			else{
				System.out.println("not updated");
			}
		}
		return updatedName;
	}
	
	
	public boolean updatePriceByName(String name,int price){
		boolean updatePrice=false;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getName().equals(name)){
				dtos[i].setPrice(price);
				updatePrice=true;
				System.out.println("updated successfully");
			}
			else{
				System.out.println("not updated");
			}
		}
		return updatePrice;
	}
	
	public boolean deleteByName(String name){
		boolean deleted=false;
		int i,j;
		for(i=0,j=0;j<dtos.length;j++){
			if(!dtos[j].getName().equals(name)){
				dtos[i++]=dtos[j];
				deleted=true;
				System.out.println("Deleted successfully");
			}
		}
		dtos=Arrays.copyOf(dtos,i);
		return deleted;	
	}

	public boolean deleteByType(String type){
		boolean deleted1=false;
		int i,j;
		for(i=0,j=0;j<dtos.length;j++){
			if(!dtos[j].getType().equals(type)){
				dtos[i++]=dtos[j];
				deleted1=true;
				System.out.println("Deleted successfully");
			}
		}
		dtos=Arrays.copyOf(dtos,i);
		return deleted1;
	}
	
	public String getFoodNameById(int id){
	 String names=null;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()==id){
				names=dtos[i].getName();
				System.out.println(dtos[i].getName());
			}
			else{
				System.out.println("not found");
			}
		}
		return names;
	}
	
	
	
	
	
}
