package com.present;

public class Uc1_presentorabsent {

	public static void main(String[] args) {
		
int fulltime=1;
double empCheck=Math.floor(Math.random() *10) % 2;
if (empCheck==fulltime) {
	System.out.println("employee is present");
}
	else {
		System.out.println("empoyee is absent");
	}
	
	

}
}

