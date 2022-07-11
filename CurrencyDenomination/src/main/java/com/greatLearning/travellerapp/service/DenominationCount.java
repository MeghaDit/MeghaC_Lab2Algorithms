package com.greatLearning.travellerapp.service;

public class DenominationCount {
	int[] payamt;
	public void calculateDenominations(int[] curr, int amount){
		
		payamt = new int[curr.length];
		for(int i=0;i<curr.length;i++) {
			if (amount>curr[i]) {
				payamt[i] = amount / curr[i];
				amount = amount - curr[i]*payamt[i];
			}			
			
		}
		
	}
	public void displayPayApproach(int[] curr) {
		System.out.println("your payment approach in order to give min no of notes will be");
		for(int i=0;i<payamt.length;i++) {
		if (payamt[i]>0) {	
			System.out.println(curr[i]+ ":" + payamt[i]);
		}
		}
	}
}
