package com.present;

public class Uc3_parttime {

	public static void main(String[] args) {
	int parttime=1;
	int fulltime=2;
	int emprateperhour=20;
	int emphour=0;
	int empwage=0;
	double empCheck =Math.floor(Math.random() *10 ) %3;
	if (empCheck==parttime) {
		emphour=4;
	}
	else if (empCheck==fulltime) {
		emphour=8;
	
	}
	else
	{
		emphour=0;
	}
	empwage = emphour * emprateperhour;
	System.out.println("emp wage; " +empwage);
	}
	{
		
		
	}
			

	}


