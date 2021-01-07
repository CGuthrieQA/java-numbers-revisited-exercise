package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		
		StringMethods sm = new StringMethods();
		
		int value = 9999;
		
		sm.addDigits(value);
		sm.toWords(value);
		sm.to100();

	}
	
}
