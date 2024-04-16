/*
 Q2. Use Arrays.sort() to sort array of Students using Comparator. Write a menu driven code to
display students
1. sorted on their city (asc)
2. sorted on their on marks (desc)
3. sorted on their on name (asc)
class Student {
private int roll;
private String name;
private String city;
private double marks;
}
 */


package p2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Students implements Comparable<Students> 
{   //fields
    private int roll;
    private String name;
    private String city;
    private double marks;
    
    //Parameterless constructor to the class
    public Students() {
		super();
	}

	//parameterized constructor to the class
	public Students(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	
   
// Getter and Setter for city 
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Students o) {
		int roll = this.roll - o.roll;
		return roll;
	}
	
	
	
}	



	

