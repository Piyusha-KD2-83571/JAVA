/*
2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average.
Hint : Check Scanner class for the methods
 
 */


import java.util.Scanner;

public class Que2 {

	private static final boolean True = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter num1 :");
		
		if (sc.hasNextDouble())
		{
			num1 = sc.nextDouble();
			System.out.print("Enter num2 :");
			if(sc.hasNextDouble())
			{
				num2 = sc.nextDouble();
				 avg = (num1+num2)/2;
				 System.out.println("The average of two Number is :"+avg);
			}
			else
			{
				System.out.print("Second number is not double");
			}
			
		
		}
		else	
		{
			System.out.println("The first Number is not Double!!");
		}
		
		
		
		
		

	}

}

/*num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			
			 double sol = (num1 + num2)/2;
			 System.out.println("The Average Solution : "+sol);*/
