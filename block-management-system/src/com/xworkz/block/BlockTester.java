package com.xworkz.block;

public class BlockTester {
	
	public BlockTester() {
		
	}

	int blockint;
	{
		System.out.println("Block is execited");
		blockint=10;
	}
	
	static int blockint1;
	static {
		System.out.println("Block is execited");
		blockint1=20;
		
	}
	public static void main(String[] args) {
	
		System.out.println("Main method started");
		BlockTester block = new BlockTester();
		BlockTester block1 = new BlockTester();
	//	Block b = new Block();
		System.out.println(block.blockint);
		System.out.println(block1.blockint1);
		

		System.out.println("Main mathod ended");
	}

}
