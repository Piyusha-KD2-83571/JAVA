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

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int choice;
		int size; // To accept the size of array
		System.out.println("Enter the size of basket : ");
		size = sc.nextInt();
		Fruits f = new Fruits();
		
		//created array Basket of type fruits which will hold size as per give by users
		Fruits[]  basket = new Fruits[size];
		
		int index = 0; // when fruits is added into basket the value will increased by 1 for each fruit.
		
		
		
		do
			{
				System.out.println("0) Exit");
				System.out.println("1) Add Mango");
				System.out.println("2) Add Orange");
				System.out.println("3) Add Apple");
				System.out.println("4) Display names of all fruits in basket");
				System.out.println("5) Display names,color,weight,taste of all fresh fruits in basket");
				System.out.println("6) Display taste of all stale fruits in basket");
				System.out.println("7) Mark fruit as stale ");
				System.out.println("8) Mark all fruit stale");
				System.out.println("9) Enter Your Choice :");
				choice = sc.nextInt();
				
				switch(choice)
				{
				case 0 :
					{
					  System.out.println("Thank You !!");	
					  break;
					}
					
					
				case 1 ://Adding Mango in Basket
				{  
					if(index < size)
						{
							 basket[index] = new Mango(); //For every basket[i] it will Create a mango object
							 basket[index].accept(sc); //adding a mango for each index value
							 index++;	 
							
						}
					else
						{
							System.out.println("Basket is full!!");
						}
					
					break;	
				}
				
				
				case 2 ://Adding Orange in Basket
				{
					if(index < size)
					{
						basket[index] = new Orange();
						basket[index].accept(sc);
						index++;
						
					}
					else
					{
						System.out.println("Basket is Full!!");
					}
					break;	
				}
				
				
				case 3 ://Adding Apple in Basket
					
				{
					if(index < size)
					{
						basket[index] = new Apple();
						basket[index].accept(sc);
						index++;
						
					}
					else
					{
						System.out.println("Basket is Full!!");
					}
					
					break;	
				}
				
				
				case 4 ://Name of fruits in Basket
				{
					for(Fruits fruit:basket) 
					{
						if (basket == null)
						{
							System.out.println("The basket is empty !!");
						}
						
						else
						{
						  String fruitName = fruit.getName();
						  System.out.println("The fruits in basket are : "+fruitName);
							   
						}
					}
				break;
				}
				case 5 ://Displaying name,color and weight of fruit in Basket
				{
					for(Fruits fruit:basket)
					{
						System.out.println("The Fruits with name : "+fruit);
					}
					break;	
				}
				
				
				case 6 ://To check the fruit in basket Is Fresh Or not if not then Print taste of fruit
				{
					for(Fruits fruit :basket) // will check at every index is fresh or not
						//assumed every fruit is fresh
					{
						if(fruit.getFresh() == false)
						{
							System.out.println("The taste of fruit in basket is : "+f.taste());
						}
					}
					break;	
				}
				
				
				case 7 ://The index value at which the user will return false the fruit will be marked as stale
				{
					System.out.println("Enter the index at which you got the fruit stale :");
					int i = sc.nextInt();
					//invalid index : index greater than 0
					if(i<index && i>=0)
						
					{
						
						
						basket[i].setFresh(false);
						System.out.println("The Fruit which is stale in Basket  :"+basket[i].getName());
						
					}
					
					
					
					break;	
				}
				
				
				case 8 ://Marking all sour Fruits  in basket are Stale
				{
					for(Fruits fruit:basket)
					{
						
						if(fruit.taste() == "Sour")
						{
						 System.out.println("All the fruit is Stale");
						}
					}
					break;
					
				}
				
				
				
				
				
				}

				
				




				
				
			
			}while(choice != 0);

	}

}
