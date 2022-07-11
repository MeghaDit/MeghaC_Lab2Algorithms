package com.greatLearning.travellerapp.Driver;
import java.util.Scanner;

import com.greatLearning.travellerapp.service.DenominationCount;
import com.greatLearning.travellerapp.service.MergeSort;
public class Main {
	static int size;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DenominationCount currDenom = new DenominationCount();
		System.out.println("Enter the size of the currency denominations");
		size = input.nextInt();
		int[] currency = new int[size];
		System.out.println("Enter the currency Denominations value");
		for(int i=0;i<size;i++) {			
			currency[i] = input.nextInt();
		}
		MergeSort sortCurr = new MergeSort();
		sortCurr.sort(currency, 0, size-1);
		System.out.println("Enter the amount that you want to pay");
		int amount = input.nextInt();
		currDenom.calculateDenominations(currency, amount);
		currDenom.displayPayApproach(currency);		
	
	}

}
