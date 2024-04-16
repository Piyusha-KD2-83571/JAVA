//
///*Q1. Write a generic sort method for implementing selection sort algorithm with given comparator
//Object as parameter. Below is reference code for selection sort do the respective changes to make it
//generic using comparator
//static void selectionSort(Integer [] arr) {
//for(int i=0; i<arr.length-1; i++)
//for(int j=i+1; j<arr.length; j++)
//if(arr[i] > arr[j]) {
//Integer temp = arr[i];
//arr[i] = arr[j];
//arr[j] = temp;
//}
//}*/
//
package p1;

import java.util.Arrays;
import java.util.Comparator;

public class SortComparator {
	
	
	// Generic method For Selection sort
	public static <T> void SelectionSort(T[] arr,Comparator<T> c) {
		for(int i =0;i<arr.length-1;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (c.compare(arr[i], arr[j]) > 0) // Will Compare Object or arguments
				{
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		
		class Sorting implements Comparator<Integer>
		{

			@Override
			public int compare(Integer o1, Integer o2) {
				int value = Integer.compare(o1,o2); //Will Compare value
				return value;
			}
			
			
			
		}
		//Sorting obj = new Sorting();
		Comparator<Integer> obj = new Sorting();
		
		Integer [] arr = {44,77,55,88,33};
		System.out.println("Array Before Sorting :");
		for(Integer e:arr)
		{
			System.out.println(e);
		}
		
		
		SelectionSort(arr,obj);
		
		
		
		System.out.println("Array After Sorting :");
		for(Integer element:arr)
		{
			System.out.println(element);
		}
		
		
	}

}
