package com.present;

public class Uc6_totalworkhour {
	final static int parttime=1;
	final static int fulltime=2;
	final static int emprateperhour=20;
	final int workingday=20;
	final static int maxhourinmonth=100;
	

	public static void main(String[] args) {
     int emphour=0,totalemphour=0,totalworkday=0;
     
	int numberofworkday = 20;
	while(totalemphour<=maxhourinmonth && totalworkday < numberofworkday) {
		totalworkday++;
		int empCheck=(int) Math.floor(Math.random() * 100) % 3;
        switch(empCheck) {
        case parttime:
        	emphour=4;
        	break;
        case fulltime:
        	emphour=8;
        	break;
       
        	
        	default:
        		emphour=0;
        }
        totalemphour += emphour;
        System.out.println("day: " +totalworkday + "emp hour:" +emphour);
	}
	int totalempwage = totalworkday * emprateperhour;
	System.out.println("total empwage: " +totalempwage);
        }
	

	}
