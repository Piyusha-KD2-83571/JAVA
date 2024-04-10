package com.app.entity;
import com.app.exception.*;

import java.util.Scanner;

public class LongString 
{
	private String str;
	
	LongString(){} //parameterless Constructor
	
	LongString(String str) // parameterized constructor
	{
		this.str = str;
	}
	
	
	public void acceptString(Scanner sc) throws ExceptionLineTooLong // to accept a string from user
	{
		System.out.println("Enter the String : ");
		str = sc.nextLine();
		if(str.length() > 80)
		{
			throw new ExceptionLineTooLong("The String is too long",str.length());
		}
		this.str = str ; 
	}
	

	
	public void displayString()
	{
		System.out.println("The String is"+str);
	}
	
	

}
