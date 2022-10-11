package com.greatlearning.service;

public class NotesCount {
	public void counting(int[] currency, int amount) {
		int noteQuantity[] = new int [currency.length];
		int i;
		int sum = 0; 
		
		for(i = 0; i<currency.length; i++) {
			
			noteQuantity[i] = amount/ currency[i];
			sum = sum+ noteQuantity[i];
			amount = amount % currency[i];
		}
		
		for(i = 0; i <currency.length;i++) {
			if(noteQuantity[i] != 0)
				System.out.println(currency[i] + " : "+ noteQuantity[i]);
		}
	}
}