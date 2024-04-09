package tester;
import java.util.Scanner;

import com.app.employee.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice ;
		
		System.out.println("1) Calculate The Salary For Salaried employees");
		System.out.println("2) Calculate the salary for the employee who works on hours");
		System.out.println("3) Calculate the salary for commission Employees");
		System.out.println("4) Calculate the salary for baseed Salaried commision Employees");
		System.out.println("5) YOU ENTERED THE WRONG CHOICE!!");
		System.out.println("Enter your choice :");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1 :
		{
			System.out.println("The Salary For Salaried Employee is");
			Employee e = new SalariedEmployee();
			e.accept(sc);
			System.out.println(e.toString());
			System.out.println(e.calSal());;
			break;
		}
		
		case 2:
		{
			System.out.println("The Salary who works in hours ");
			Employee e1 = new HourlyEmployee();
			e1.accept(sc);
			System.out.println(e1.toString());
			System.out.println(e1.calSal());
			break;
			
		}
		
		case 3 :
		{
			System.out.println("The Salary who works in hours ");
		    Employee e3 = new CommissionEmployee();
		    e3.accept(sc);
		    System.out.println(e3.toString());
		    System.out.println(e3.calSal());
			break;
		}
		
		case 4 :
		{
			System.out.println("The Salary who works in hours ");
		    CommissionEmployee c1 = new BasePlusCommission();
		    c1.accept(sc);
		    System.out.println(c1.toString());
		    System.out.println(c1.calSal());
		    BasePlusCommission base = (BasePlusCommission) c1;
		    base.bonus();
		    
			break;
		}
		case 5 :
		{
			System.out.println("You Entered the wrong Choice");
		}
		
		}
		
		

	}

}
