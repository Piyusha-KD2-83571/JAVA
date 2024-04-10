package com.app.entity;

import java.util.Scanner;

import com.app.exception.*;

public class Tester 
{

	public static void main(String[] args) 
	{
		
       Scanner sc = new Scanner(System.in);
       
       LongString string = new LongString();
       
       try 
       {
         string.acceptString(sc);
       }
       catch(ExceptionLineTooLong e)
       {
    	  e.printStackTrace(); 
       }
       System.out.println("The Programmed run successfully!!"); 

	}

}
