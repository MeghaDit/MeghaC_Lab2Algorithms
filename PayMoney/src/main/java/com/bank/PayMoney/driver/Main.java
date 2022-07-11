package com.bank.PayMoney.driver;

import java.util.Scanner;

import com.bank.PayMoney.service.PayMoney;

public class Main {
	
    static int[] transactions;
    static int size;
    static int target;
    static int targetDays;
    
	public static void main(String[] args) {
		PayMoney pay = new PayMoney();
		System.out.println("Enter the size of the transaction Array");
		Scanner input = new Scanner(System.in);
		size = input.nextInt();
		transactions = new int[size];
		for(int i = 0;i<size;i++) {
			System.out.println("Enter the daily transactions in crores for day:" +(i+1));
			transactions[i] = input.nextInt();
		}
		
		System.out.println("Enter the value of the target that you want to achieve in crores");
		target = input.nextInt();
	
		targetDays = pay.checkTarget(transactions, target);
		if (targetDays>0) {
		System.out.println("Target Achieved in " + targetDays + "transactions");
		}
		else {
			System.out.println("Target not achieved");
		}
        
	}
	
	
	

}
