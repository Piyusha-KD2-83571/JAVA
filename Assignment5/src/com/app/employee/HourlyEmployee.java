package com.app.employee;

import java.util.Scanner;

public class HourlyEmployee extends Employee
{
	private double  wages;
	private int hours;
	
	
	
	public HourlyEmployee() {}



	public HourlyEmployee(double wages, int hours)
	{
		
		this.wages = wages;
		this.hours = hours;
	}
     
	public void accept(Scanner sc)
	{
		System.out.println("Enter the wages :");
		wages = sc.nextDouble();
		
		System.out.println("Enter th hours :");
		hours = sc.nextInt();
		
		super.accept(sc);
		
	}
	
	


	@Override
	public String toString() {
		return "HourlyEmployee [wages=" + wages + ", hours=" + hours + "]";
	}



	@Override
	public double calSal() {
		if(hours < 40)
		{
			double salary = wages*hours;
			return salary;
		}
		else 
		{
			double salary = (wages*40)+(hours-40)*wages*1.5;
			return salary;
		}
		
	}
	
	
}
