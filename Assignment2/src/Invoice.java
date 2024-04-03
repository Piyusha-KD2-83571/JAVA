/*
 Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.
 */



import java.util.Scanner;
import java.lang.String;

public class Invoice {
	
	//Fields of Invoice
	private String part_no;
	private String part_desc;
	private int quantity;
	private double price_per_item;
	
	
	//parmeterless constructor of invoice
	Invoice()
	{
		
		System.out.println("Inside Parameterless constructor");
	}
	
	//parameterized constructor of invoice
	Invoice(String part_no ,String part_desc ,int quantity ,double price_per_item)
	{
		this.part_no = part_no;
		this.part_desc = part_desc;
		this.quantity = quantity;
		this.price_per_item = price_per_item;
	}
	

	 //Get and Set Method For Part Number
	public void setPartNo(String part_no)
	{
		this.part_no = part_no;
	}
	
	public String getPartNo()
	{
		return part_no;
	}
	
	
 //Get and Set Method For Part Number
	public void setPartDesc(String part_desc)
	{
	  this.part_desc = part_desc;
	}
		
	public String getPartDesc()
	{
		return part_desc;
	}
	
	
	//Get and Set Method For Quantity
		public void setQuantity(int quantity)
		{
		  this.quantity = quantity;
		}
			
		public int getQuantity()
		{
			if(quantity < 0)
			{
				System.out.println("0");
				
			}
			
			return quantity;
			
		}
		
	//Get and Set Method For Price per item
		public void setPricePerItm(double price_per_item)
		{
			 this.price_per_item = price_per_item;
		}
					
		public double getPricePerItm()
		{
			if (price_per_item < 0)
			{
				System.out.println("0.0");
			}
			
			return price_per_item;
		}
		
		// Method To Calculate Amount
		public double calculateAmt(double price_per_item, int quantity )
		{
			double amt = price_per_item * quantity;
			return amt;
		}
		
		
	
	

	
	

}
