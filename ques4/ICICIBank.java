package com.ques4;

public class ICICIBank extends Bank{

	double rateOfInterest;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	void displayDetails() {
		System.out.println("Name : "+branchName);
		System.out.println("Code : "+IfscCode);
		System.out.println("Rate of Interest : "+rateOfInterest);
	}

}