
import java.util.Scanner;

public class DrivingCost {
 private double miles;
 private double costPerGallon;
 private double avgMilesPerGallon;
 private double parkingfees;
 private double tollPerDay;
 Scanner sc = new Scanner(System.in);
 

 public DrivingCost() {
	// TODO Auto-generated constructor stub
}
 
 public void accept()
 {
	 System.out.println("Enter total miles driven per day: ");
	 miles = sc.nextDouble();
	 
	 System.out.println("Enter Cost per gallon of gasolin: ");
	 avgMilesPerGallon = sc.nextDouble();
	 
	 System.out.println("Enter Average miles per gallon: ");
	 parkingfees = sc.nextDouble();
	 
	 System.out.println("Enter Tolls per day: ");
	 tollPerDay = sc.nextDouble();
 }
 
 public void costOfDriving()
 {
	 double TotalCost;
	 
	 TotalCost=((miles/avgMilesPerGallon)*costPerGallon)+parkingfees+tollPerDay;
	 
	 System.out.println("The total money could be saved by car pooling: "+TotalCost);
 }
 
}
