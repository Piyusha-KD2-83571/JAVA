package p2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Tester {
	
	//Method for menu of the program
	public static int menu()
 {
	System.out.println("----------------------------------------------------");
	System.out.println("0.THANK YOU FOR ENTERING OUR STUDENT DATA PORTAL!!");
	System.out.println("1.Students data sorted on their City Name");
	System.out.println("2.Students data sorted on their Marks");
	System.out.println("3.Students data sorted on their Studnt's Name");
	System.out.println("Enter Your Choice: ");
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	System.out.println("----------------------------------------------------");	
	return choice;
}
	
	

	public static void main(String[] args) {
int choice;
		
		//Array For students
		Students[] arr = new Students[6];
		arr[0] = new Students(2,"Disha","Ichalkaranji",92);
		arr[1] = new Students(1,"Atharv","Gadhinglaj",89);
		arr[2] = new Students(5,"Swarupa","Islampur",93);
		arr[3] = new Students(4,"Mrunal","Ajra",94);
		arr[0] = new Students(3,"lavnaya","Kolhapur",90);
		arr[0] = new Students(6,"Rohit","Tasgaon",95);
		
		class CityName implements Comparator<Students> {
			@Override
			public int compare(Students o1, Students o2) {
				int value = o1.getCity().compareTo(o2.getCity());
				return value;
			}
		}

		Comparator<Students> city = new CityName();
		
		
		
		while((choice = menu())!= 0)
		{
		   switch(choice)
		   {
		   case 1 : //To Display data based on city name in ascending order
			   System.out.println("STUDENTS DATA ON CITY NAME ");
			   Arrays.sort(arr,city);
			   
			   for(Students c : arr)
				   System.out.println(c);
			   
			   
			   
			   break;
			   
		   }
		}
		

	}

}
