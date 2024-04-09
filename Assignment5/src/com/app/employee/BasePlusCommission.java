package com.app.employee;

import java.util.Scanner;

public class BasePlusCommission extends CommissionEmployee
{
	private double base_sal;


	public BasePlusCommission(double gross_sale, double comm_rate, double base_sal) 
	{
		super(gross_sale, comm_rate);
		this.base_sal = base_sal;
	}

	public BasePlusCommission() {}
	
     public void accept(Scanner sc)
     {
    	 super.accept(sc);
    	 System.out.println("Enter the base salary :");
    	 base_sal = sc.nextDouble();

     }
     
     
	
	@Override
	public String toString() {
		return "BasePlusCommission [base_sal=" + base_sal + ", gross_sale=" + gross_sale + ", comm_rate=" + comm_rate
				+ ", calSal()=" + calSal() + ", toString()=" + super.toString() + ", getGross_sale()=" + getGross_sale()
				+ ", getComm_rate()=" + getComm_rate() + ", getF_name()=" + getF_name() + ", getL_name()=" + getL_name()
				+ ", getSsn()=" + getSsn() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public double calSal()
	{
		double salary = comm_rate*gross_sale+base_sal;
		return salary;
	}
	
	
	public   double bonus()
	{
		double salary;
		salary = (comm_rate*gross_sale)+base_sal+base_sal*0.1;
		return salary;
	}

	
	
	
	
	
}
