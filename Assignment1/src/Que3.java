/*
 3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.
(No need of any class, and no need to display the food deatils. Only display the total of orderd
food)
 
 */
import java.util.Scanner;
public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
     
       
       int amt = 0;
       int order = 0;
       int choice;
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.println("FOOD MENU ");
			System.out.println("0.Generate Bill");
			System.out.println("1.Dosa ");
			System.out.println("2.Samosa  ");
			System.out.println("3.Idli ");
			System.out.print("Enter your choice:");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 0 :
			   System.out.println("Generate Bill :");
			
			case 1 :
			
				System.out.println("Purchased Samosa");
				amt += 30;
				order++;
				break;
			
			case 2:
			
				System.out.println("Purchased Idli");
				amt += 20;
				order++;
				break;
				
			case 3:
				
				System.out.println("Purchased Samosa");
				amt += 15;
				order++;
				break;
			
		
			
			default :
				System.out.println("Not Available.....");
			
			
			
			}

			
		}while(choice!= 0 );
		System.out.println("Total order :"+order);
		System.out.println("Total Amount :-"+amt);
		

	}

}
