package com.xworkz.atmapp;

public class AtmMachine {
	
	public void withdrawnAmount(double amt) throws AtmException {
		System.out.println("Inside withdrawAmount()");
		if(amt>=40000) {
			throw new AtmException("The amount is exceded limit");
		}else if(amt%100!=0) {
			throw new AtmException("The amount is exceded limit");
		}else {
			System.out.println("withdraw is sucessfull");
		}
		System.out.println("withdrawAmount() ended");
	}

}
