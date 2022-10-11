package com.greatlearning.paymoney.target;
import java.util.Scanner;

public class DriverClass {
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter size of transaction array:");//size of transaction array (number of transactions)
		int size = sc.nextInt();
		
		//creating array
		System.out.println("Enter the values of array:"); //transaction list
		int trans[] = new int[size];
		for(int i = 0; i<size; i++) {
			trans[i] = sc.nextInt();
		}
		
		//number of targets
		System.out.println("Please Enter the total number of targets that need to be achieved:");
		int testCases = sc.nextInt();
		
		int targetAmount;
		int sum, j, flag;
		for(int i = 1; i <= testCases; i++) {
			sum= 0;
			flag= 0;
			System.out.println("Enter the value of target-" + i);
			targetAmount = sc.nextInt();
			for(j = 0; j < trans.length; j++) {
				sum = sum + trans[j];
				
				if(sum >= targetAmount) {
					System.out.println("Target achieved after " + (++j)+ " transactions");
					flag = 1;
					break;
				}
			}
			if(flag ==0)
			System.out.println("Given target not achieved...");
		}		
	}
}


