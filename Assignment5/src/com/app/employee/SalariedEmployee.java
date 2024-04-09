package com.app.employee;

import java.util.Scanner;

public class SalariedEmployee extends Employee
{
	private double  weekly_sal;
	
	
	
	public SalariedEmployee() {}


     public void accept(Scanner sc)
     {
    	 System.out.println("Enter the weekly salary for Employee :");
    	 weekly_sal = sc.nextDouble();
    	 super.accept(sc);
     }
     
     
     
	@Override
	public String toString()
	{
		return "SalariedEmployee [weekly_sal=" + weekly_sal + "]";
	}


	public SalariedEmployee(double weekly_sal) 
	{
		
		this.weekly_sal = weekly_sal;
	}



	public double calSal()
	{
		return 30000.00;
	}
}
