package com.xworkz.block;

public class Block {

	public Block() {
		System.out.println(this.getClass().getSimpleName()+" "+"object is created");
	}
	
	{
		System.out.println("block 1 is execuited");
		
	}
	{
		System.out.println("block 2 is execuited");
		
	}
}
