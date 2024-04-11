package com.app.entity;

import java.util.Scanner;

public class PalindromeString 
{
	private String rev = " ";// a null string to store our reversed string
    
	public PalindromeString() {} // parameterless constructor

	public void acceptString(Scanner sc) // accept method to accept string from user
	{
		System.out.println("Enter The String You Want to Check Palindrome :");
		String str = sc.next();
		 int length = str.length();
			for(int i = length-1;i>=0;i--)
			{	
				rev = rev+str.charAt(i);	
			}	
			
			if(rev.equals(str))
			{
				System.out.println("The Given String Is Palindrome!!");
				
			}
			else
			{
				System.out.println("The String Is Not A Palindrime!!");
			}

     }
	
	
	
}
