package com.greatlearning.app;
import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.service.NotesCount;
import com.greatlearning.sort.BubbleSort;

public class DriverClass {
//main method
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number (size) of currency denominations in your country"); //array size
		int size = sc.nextInt();
		
		int currency[] = new int[size];
		for(int i = 0; i<size; i++) {
			System.out.println("Enter the currency denominations value " + (i+1)); //array elements
			currency[i] = sc.nextInt();
		}
		
		System.out.println("Before Sorting: " + Arrays.toString(currency));
		//sorting of array from descending to ascending order
		BubbleSort bs = new BubbleSort();
		bs.sort(currency);
		
		System.out.println("After Sorting: " + Arrays.toString(currency));
		
		System.out.println("Please enter the amount you want to pay");
		int amount = sc.nextInt();
		
		System.out.println("Your payment approach to give minimum number of notes will be:");
		NotesCount nc = new NotesCount();
		nc.counting(currency, amount);	
	}
}
