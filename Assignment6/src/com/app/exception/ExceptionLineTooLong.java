package com.app.exception;


//As we are creating a checked exception it we will inherit methods from exception class
public class ExceptionLineTooLong extends Exception 
{
	private String msg;
	private int length;

	public ExceptionLineTooLong() //parameterless
	{
		msg = " ";
	}

	public ExceptionLineTooLong(String msg, int length) {
		super();
		this.msg = msg;
		this.length = length;
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong [msg=" + msg + ", length=" + length + "]";
	}
	
	
//	public ExceptionLineTooLong(String msg) //parameterized
//	{
//		this.msg = msg;
//	}
	
	
	
	
	

}
