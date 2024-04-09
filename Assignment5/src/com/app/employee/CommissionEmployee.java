package com.app.employee;

import java.util.Scanner;

public class CommissionEmployee extends Employee
{
	 protected double gross_sale;
	 protected double comm_rate;
	
	
	public CommissionEmployee(double gross_sale, double comm_rate) 
	{
		
		this.gross_sale = gross_sale;
		this.comm_rate = comm_rate;
	}
     
	

	public CommissionEmployee() {}



	@Override
	public double calSal() 
	{
		double salary = comm_rate*gross_sale;
		return salary;
	}
     
	public void accept(Scanner sc)
	{
		System.out.println("Enter the gross_sale :");
		gross_sale = sc.nextDouble();
		
		System.out.println("Enter the comm_rate: ");
		comm_rate = sc.nextDouble();
		
		super.accept(sc);
	}
	
	


	@Override
	public String toString() {
		return "CommissionEmployee [gross_sale=" + gross_sale + ", comm_rate=" + comm_rate + "]";
	}



	public double getGross_sale() {
		return gross_sale;
	}



	public void setGross_sale(double gross_sale) {
		this.gross_sale = gross_sale;
	}



	public double getComm_rate() {
		return comm_rate;
	}



	public void setComm_rate(double comm_rate) {
		this.comm_rate = comm_rate;
	}
	
	
	
}
