
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice i; //reference of invoice type (does not call constructor)
		i = new Invoice(); //object created ; parameterless constructor gets call
		
		i.setPartNo("1234");
		String part_no = i.getPartNo();
		System.out.println("The Part No is :"+part_no);
		
		i.setPartDesc("Gear");
		String part_desc = i.getPartDesc();
		System.out.println("The Part Description:  "+part_desc);
		
		i.setQuantity(-1);
		int quantity = i.getQuantity();
		System.out.println("The Quantity is:  "+quantity);
		
		i.setPricePerItm(-2);
		double price_per_item = i.getPricePerItm();
		System.out.println("The Price per item is :   "+price_per_item);
		
		double bill = i.calculateAmt(price_per_item,quantity);
		System.out.print("The Calculated amount : ");
		System.out.println(bill);
		
		

	}

}

