//Reverse The string

package com.app.entity;

import java.util.Scanner;

public class RevString{
	     
	    private String rev = " ";// a null string to store our reversed string
	    
		public RevString() {} // parameterless constructor

		public void acceptString(Scanner sc) // accept method to accept string from user
		{
			System.out.println("Enter The String You Want to Reverse :");
			String str = sc.next();
			 int length = str.length();
				for(int i = length-1;i>=0;i--)
				{
					
					rev = rev+str.charAt(i);
				}
			
				System.out.println("The Reversed String is :"+rev);
		}
		

}
