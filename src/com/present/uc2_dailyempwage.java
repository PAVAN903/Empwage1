package com.present;

public class uc2_dailyempwage {

	public static void main(String[] args) {
		int fulltime=1;
		int emprateperhour=20;
		int emphour=0;
		int empwage=0;
		double empCheck=Math.floor(Math.random() * 10) % 2;
		if(empCheck==fulltime) {
			emphour=8;
		}
		else
		{
			emphour=0;
		}
		empwage = emphour * emprateperhour;
		System.out.println("emp wage ; " +empwage);
		}
		}

	


