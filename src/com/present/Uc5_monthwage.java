package com.present;

public class Uc5_monthwage {
static final int parttime=1;
  static final int fulltime=2;
static final int emprateperhour=20;
int empworkday=20;
int totalempwage=0;

	public static void main(String[] args) {
	int emphour=0,empwage=0,totalempwage=0;
	int empworkday = 20;
	for(int day=0;day<empworkday; day++) {
		int empCheck= (int) Math.floor(Math.random() *10) % 3; 
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
		empwage=emphour *emprateperhour;
		totalempwage += empwage;
		System.out.println("emp wage :" +empwage);
	}
	System.out.println("total employee wage : " +totalempwage );
			
		
		
		}
		
		
	

	
			
}
