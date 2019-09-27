package assignment;

public class Product {
	
	public String toString() {
		return "Hello";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product[] = new Product[5];
		
		for (int i = 0; i < product.length; i++) {
			product[i] = new Product();
		}
		for (int i = 0; i < product.length; i++) {
			System.out.println(product[i]);
		}
		

	}

}
