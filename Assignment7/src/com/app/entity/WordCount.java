package com.app.entity;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to get The Number of word in a string :");
		 String str = sc.next();
		
		 String s[] = str.split("");
		 System.out.println("Number of string word is :"+str+" "+s.length);
		
		
		
		
		

	}

}
