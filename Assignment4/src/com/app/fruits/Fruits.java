/*Q1 Apply inheritance n polymorphism
a) Arrange Fruit,Apple,Orange,Mango in inheritance hierarchy
b) Properties (instance variables) : color : String , weight : double , name:String, isFresh : boolean
c) Add suitable constructors.
d) Override toString correctly to return state of all fruits (including : name ,color , weight )
e) Add a taste() method : public String taste()
For Fruit : it should return "no specific taste"
Apple : should return "sweet n sour"
Mango : should return "sweet"
Orange : should return "sour"
f) Add all of above classes under the package "com.app.fruits"
g) Create java application FruitBasket , with main method , as a tester
h) Prompt user for the basket size n create suitable data structure and give options
0. Exit
1. Add Mango
case 1 : boundary checking
basket[counter++]=new Mango(nm,weight,color);
break;
2. Add Orange
3. Add Apple
NOTE : You will be adding a fresh fruit in the basket , in all of above options.
4. Display names of all fruits in the basket.
eg : for-each --- null checking --getName()
5. Display name,color,weight , taste of all fresh fruits , in the basket.
eg : for-each , null checking --toString , taste, isFresh : getter
6. Display tastes of all stale(not fresh) fruits in the basket.
7. Mark a fruit as stale
i/p : index
eg : setter : isFresh : false
o/p : error message (in case of invalid index) or mark it stale
8. Mark all sour fruits stale (optional)
eg : for-each , taste --equals(String)*/



package com.app.fruits;

import java.util.Scanner;

public class Fruits
	{
	 	private String color;
	 	private double weight;
	 	private String name;
	    private boolean isFresh = true;
	 	
	 	Fruits()
	 	{}
	 	
	 	Fruits(String color,double weight,String name)
	 	{
	 		this.color  = color;
	 		this.weight = weight;
	 		this.name   = name;
	 		
	 		
	 	}
	 	 //Accepting Value 
	 	public void accept(Scanner sc)
	 	{
	 		System.out.println("Enter the color of the fruit : ");
	 		color = sc.next();
	 		
	 		System.out.println("Enter the weight of the fruit :");
	 		weight = sc.nextDouble();
	 		
	 		System.out.println("Enter the name : ");
	 		name = sc.next();	
	 		
	 		
	 	}
	 	
	 	//Displaying Value
	 	public void display()
	 	{
	 		System.out.println("The color of fruit is :"+color);
	 		System.out.println("The weight of fruit is : "+weight);
	 		System.out.println("The name of fruit is : "+name);
	 		System.out.println("Fruit is : "+isFresh);
	 		
	 	}
	 	
	 	
	 	
	 	@Override
		public String toString() {
			return "Fruits [color=" + color + ", weight=" + weight + ", name=" + name + "]";
		}

		public String taste()
	 	{
	 		return "No Specific Taste";
	 	}
		
		//getter to get name of fruits in basket
		public String getName()
		{
			return name;
		}
		
		//to know the freshness of fruit we have used getter method
		public boolean getFresh()
		{
			return isFresh;
		}

		
       public void setFresh(boolean isFresh)
        {
			this.isFresh = isFresh;
		}
	 	
	 	
	 	
	 	
	 	
	

	}
