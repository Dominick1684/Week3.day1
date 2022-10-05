package org.department;

public class AxisBank extends BankInfo {

	
	public void deposit() {
		 	
		System.out.println("Recurring deposit amount is Rs:50,000");

	}
	public static void main(String[] args) {
		
		AxisBank AB = new AxisBank();
		AB.deposit();
		AB.fixed();
		AB.saving();
	    
	}
	    
}
