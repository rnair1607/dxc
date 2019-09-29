package assignment;

import java.util.Scanner;

public class HardCodedUserPoducts {
	
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	
	
	public String toString() {
		return ("\nProduct \n********\nProduct ID: "+productId+"\nProduct Name: "+productName+"\nQuantity On Hand: "+quantityOnHand+"\nPrice: "+price);
	}

	
	public HardCodedUserPoducts() {
		
		this.productId = 0;
		this.productName = "NA";
		this.quantityOnHand = 0;
		this.price = 0;
	}
	
	


	public HardCodedUserPoducts(int productId, String productName, int quantityOnHand, int price) {
		this();
		
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int retrieve=0;
		
		HardCodedUserPoducts product1 = new HardCodedUserPoducts(1001,"Endurance BT",5,2365);
		HardCodedUserPoducts product2 = new HardCodedUserPoducts(1002,"OnePlus 6T",2,37999);
		HardCodedUserPoducts product3 = new HardCodedUserPoducts(1003,"RTX 2060",4,38999);
		HardCodedUserPoducts product4 = new HardCodedUserPoducts(1004,"i7 9900k",2,35000);
		HardCodedUserPoducts product5 = new HardCodedUserPoducts(1005,"Corsair Scimitar Pro",4,5999);
		
		System.out.println("Enter the Product ID: ");
		retrieve = sc.nextInt();
		
		switch(retrieve){
			
		case 1001:
			System.out.println(product1);
			break;
			
		case 1002:
			System.out.println(product2);
			break;
		
		case 1003:
			System.out.println(product3);
			break;
			
		case 1004:
			System.out.println(product4);
			break;
			
		case 1005:
			System.out.println(product5);
			break;
			
		default:
			System.out.println("The product with Product ID: "+retrieve+" doesn't exist.");
			System.out.println("Thank you for using this application.");
			System.out.println("-------------------------------------");
			System.exit(0);
		}
	}

}
