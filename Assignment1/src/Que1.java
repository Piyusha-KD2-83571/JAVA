/*Q1. Accept a integer number and when the program is executed print the binary, octal and
hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())*/


import java.util.Scanner;
public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Number : "); // Taking number as input
		num = sc.nextInt();
		
		System.out.println("Given Number :"+num);//Displaying Input
		
		String binary_no = Integer.toBinaryString(num);
		System.out.println("Binary equivalent :"+binary_no);//converted To Binary String 
		//using toBinaryString Method which returns String.
		
		String octal_no = Integer.toOctalString(num);
		System.out.println("Octal Equivalent :"+octal_no);//converted To octal String 
		//using toOctalString Method which returns String.
		
		String hex_no = Integer.toHexString(num);
		System.out.println("Hexadecimal Equivalent :"+hex_no);//converted To hexadecimal String 
		//using toHexString Method which returns String.
		
	
		
		
	    
		

	}

}
