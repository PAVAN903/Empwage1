package com.present;

public class Uc4_switchcase {

	
	 final static int parttime=1;
	 final static int fulltime=2;
	  final static int emprateperhour=20;
	public static void main(String[] args) {
	
int emphour=0;
int empwage=0;
int empCheck =(int) Math.floor(Math.random() * 100) % 3;
switch (empCheck) {
case parttime:
	emphour=4;
	break;
case fulltime:
	emphour=8;
	break;
	default:
	emphour=0;
}
empwage=emphour * emprateperhour;
System.out.println("empwage : " +empwage);

}
	}


