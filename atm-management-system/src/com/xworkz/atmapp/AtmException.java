package com.xworkz.atmapp;

public class AtmException extends RuntimeException {
	public AtmException(String str) {
		this.str = str;
	}
	String str;
	@Override
	public String toString() {
		return str;
	
	}
}
