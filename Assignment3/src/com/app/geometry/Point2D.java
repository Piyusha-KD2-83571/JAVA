/*
 Q1. Copy the Point2D class , along with the package from previous assignment.
a) Create a class "TestPointArray1.java" in "tester" package for the following
b) Accept , how many no of points to plot from user.
c) Create suitable data structure
Hint : Point2D[] points=new Point2D[sc.nextInt()];
d) Prompt user for x & y co ordinates n store the data suitably
Hint : for loop
e) Supply Menu to user with various Options like following
1. Display details of a specific point
User i/p : index
O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
2) Display x, y co-ordinates of all points
Hint : for-each
3) User i/p : 2 indices for the points , validate the indices
Display distance between specified points (iff they are not located at the same position)
eg : sop("Enter index of strt point n end point");
validation : boundary condition (0<=index<length-1)
isEqual -- false --compute distance --display it.
4. Exit 
 
 */


package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;
	
	Scanner sc = new Scanner(System.in);
	
	public Point2D()
	{
		
	}
	
	
	//Parameterized  Constructor  Of Point2D
	public Point2D(int x,int y) // made public as we are gonna access it in another package
	{
		this.x = x;
		this.y = y;	
	}
	
	//Getting String as return 
	public String getDetails()
	{
	  return "("+ x+","+y+")";
	}
	
	
	//accept Point From users
	public void acceptPoint()
	{
		System.out.print("Enter value of x :-");
		x = sc.nextInt();
		System.out.print("Enter value of y :-");
		y = sc.nextInt();
		
		
	}
	
	//Display Method To display Points
	public void displayPoint()
	{
		System.out.println("("+x+","+y+")");
	}
	
	//IsEqual method
	
	public boolean isEqual(Point2D p)
	{
		if (this.x == p.x && this.y == p.y)
		
			return true;
		else 
			return false;
	}
	
	public double distance(Point2D p)
	{	
		return Math.sqrt(Math.pow(p.x - this.x,2)+Math.pow(p.y - this.y, 2));
	}


}
