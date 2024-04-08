/*
 Q2. Create a class Point2D , in package - "com.app.geometry" : for representing a point in x-y co-
ordinate system. Create a parameterized constructor to init x & y co-ords. Add a method to return
string form of point's x & y co-ords
Hint : public String getDetails())
Add isEqual method to Point2D class :a boolean returning method : must return true if n only if
both points are having same x,y co-ords or false otherwise.
Add calculateDistance method to calculate distance between current point and specified point &
return the distance to the caller.
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points
from user (Scanner) --to create 2 points (p1 & p2)
Use getDetails method to display point details.(p1's details & p2's details)
Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same
position)
If they are not located at the same position , display distance between p1 & p2 
 */


package tester;
import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x2, y2;
		Point2D p1 = new Point2D(2,3); // calling parameterized constructor 
		
		Scanner sc  = new Scanner(System.in);
		
		   
		   // TestPoint.getDetais(p1);
		
		
		 String S = p1.getDetails();//getting method
		 System.out.println("The x and y co-ordinate : "+S);
		 
		 //Taking X2 Co-ordinate from user
		 System.out.println("Enter the x2-co-ordinate : ");
		 x2 = sc.nextInt();
		 
		//Taking Y2 Co-ordinate from user
		 System.out.println("Enter the y2-co-ordinate : ");
		 y2 = sc.nextInt();
		 
		 Point2D p2 = new Point2D(x2,y2);
		 System.out.println("The Cordinate X2 and Y2 are : ");
		 
		 
		 if(p1.isEqual(x2, y2)== true)
			{
				System.out.println("coordinate you provides are pointing to a same point");
			}
			else
			{
				p1.distance(x2, y2);
			}
		 
		 
		 
		 
		 

	}

}
