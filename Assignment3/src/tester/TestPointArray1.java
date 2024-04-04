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


package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		//To accept how many Points to be plotted
		System.out.println("Enter The no of points you want to plot : ");
	  	 
		Point2D[] points = new Point2D[ sc.nextInt()];//eg.Point2D[] points = new Point2D[3]
	    		 
	    	     for(int i=0;i<points.length;i++)
	    	     {
	    	    	 points[i]=new Point2D(); //eg.point[0] = 10
	    	    	 points[i].acceptPoint();
	    	    	 
	    	     }
	    	    	    	 
	    	    	 
	    
		
		int choice;
		do
		{
			System.out.println("\n***************************************");
			System.out.println("1.Display details of a specific point ");
			System.out.println("2.Display x, y co-ordinates of all points");
			System.out.println("3.Display distance between specified points");
			System.out.println("4.Exit");
			System.out.println("Enter Your choice:");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				int index;
				System.out.println("Enter The specific point you want:");
				index = sc.nextInt();
				System.out.println("*************************************");
				for(int i=0;i<points.length;i++)
				{
					if(points[index]==points[i])
					{
						System.out.println("The Specified point is :- ");
						
						points[index].displayPoint();
						System.out.println("----------------------------------");
					}
				}
			}
				break;
			case 2 :
				{
					for (int i=0;i<points.length;i++)
				       {
						System.out.println("The cordinates of x and y are :- ");
					      points[i].displayPoint();
					      System.out.println("----------------------------------");
				       }
					
				}
				break;
				
			case 3:
			{
				int pstart,pend;
				System.out.print("Enter Starting point : ");
				pstart = sc.nextInt();
				if(pstart>=0 && pstart<points.length)
				{
					System.out.print("Enter End point : ");
					pend = sc.nextInt();
					
					if(pend>=0 && pend<points.length)
					{
					 
					 if(points[pstart].isEqual(points[pend]))
						{
							System.out.println("coordinate you provides are pointing to a same point");
						}
						else
						{
							System.out.println("Starting point and Ending point are at different position");
							double distance = points[pstart].distance(points[pend]);
							System.out.println("Distance between Start point and End point = " + distance);
						}
					}
					else
					{
						System.out.println("Invalid Index ");
					}
					 
				}
				else
				{
					System.out.println("Invalid Index ");
				}
			
				
			}
			break;
			
			}
			
			
			
			
		}
		while(choice!=0);
		

	}

}
