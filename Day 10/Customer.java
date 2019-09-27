package oopsDemo;

public class Customer {
	
	int customerId ;
	String customerName;
	String customerAddress;
	int billAmt ;
	
	public Customer() {
		
		this.customerId = 0;
		this.customerName = "Not Available";
		this.customerAddress = "Not Available";
		this.billAmt = 100;
		
		
		
	}
	
	
	

	public Customer(int customerId, String customerName, String customerAddress, int billAmt) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmt = billAmt;
		
		
	}
	
	public void display() {
		
		System.out.println("Customer ID: "+customerId);
		System.out.println("Customer Name: "+customerName);
		System.out.println("Address: "+customerAddress);
		System.out.println("Reciept: "+billAmt);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer(1,"Neha","Delhi",900);
		
		Customer customer2 = new Customer(2,"Rekha","Mumbai",1100);
		
		Customer customer3 = new Customer();
		
		Customer customer4 = new Customer(3,"Rahul","Ahmedabad",1300);
		
		Customer customer5 = new Customer();
		
		
		customer1.display();
		System.out.println("-------------");
		customer2.display();
		System.out.println("-------------");
		customer3.display();
		System.out.println("-------------");
		customer4.display();
		System.out.println("-------------");
		customer5.display();
	}

}
