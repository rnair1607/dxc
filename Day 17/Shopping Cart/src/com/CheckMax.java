package com;

public class CheckMax {
	
	int num1,num2;
	public int Max(int num1,int num2) {
		int maximum = 0 ;
		
		if (num1>num2) {
			maximum = num1;
		}
		else if(num1<num2) {
			maximum = num2;
		}
		else {
			maximum = num1;
		}
		
		return maximum;
		
	}

}
