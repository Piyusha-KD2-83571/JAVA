package com.app.employee;

import java.util.Scanner;

public abstract class Employee
{
		private String f_name; //First Name
		private String l_name; //Last Name
		private int ssn; //Social Security Number //Eg : Adhar Card
		
		
		
		public Employee() {} //parameterless

		public Employee(String f_name, String l_name, int ssn) //parameterized
		{
			
			this.f_name = f_name;
			this.l_name = l_name;
			this.ssn = ssn;
		}
		
		public void accept(Scanner sc)
		{
			System.out.println("Enter the First Name of Employee :");
			f_name = sc.next();
			System.out.println("Enter the Last Name of Employee :");
			l_name = sc.next();
			System.out.println("Enter the ssn no :");
			ssn = sc.nextInt();
			
		}
		
//		public void display()
//		{
//			System.out.println("First Name : "+f_name);
//			System.out.println("Last Name : "+l_name);
//			System.out.println("SSN : "+ssn);
//		}
		
		

		public String getF_name() //get First Name
		{
			return f_name;
		}

		@Override
		public String toString() //We do not need To write the display method if we use toString Method
		{
			return "Employee [f_name=" + f_name + ", l_name=" + l_name + ", ssn=" + ssn + "]";
		}

		public void setF_name(String f_name) //set firstName
		{
			this.f_name = f_name;
		}

		public String getL_name() //get LastName
		{
			return l_name;
		}

		public void setL_name(String l_name) //set LastName
		{
			this.l_name = l_name;
		}

		public int getSsn() //get SSN
		{
			return ssn;
		}

		public void setSsn(int ssn) //set ssn
		{
			this.ssn = ssn;
		}
		
		
	
		public abstract double calSal(); //Abstract Method dont have body // we need to make class abstract 
		//As we don't know what to write in calculate salary
	
		
		
		
		
		
		
}

















