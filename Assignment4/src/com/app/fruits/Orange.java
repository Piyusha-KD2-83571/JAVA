package com.app.fruits;

import java.util.Scanner;

public class Orange extends Fruits
	{
	public Orange() {}

		public Orange(String color, double weight, String name)
			{
				super(color, weight, name);
		
			}
	
		public String taste()
			{
				return "Sour";
			}
	
	}
