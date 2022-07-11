package com.bank.PayMoney.service;

public class PayMoney {

	public int checkTarget(int[] arr, int target) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			if (sum==target) {
				return i+1;
			}
						
		}
		return -1;
	}
}
