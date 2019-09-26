package assignment;
import java.util.Scanner;

public class AdditionModified {
	Scanner sc = new Scanner(System.in);
	
	int num1;
	int num2;
	
	public void display() {
		System.out.print("Enter the first no: ");
		num1 = sc.nextInt();
		
		System.out.print("Enter the second no: ");
		num2 = sc.nextInt();
		
		if(num1<0 || num2<0) {
			System.out.println("One or more inputs is negative.");
		}
		else {
			System.out.println("The sum is: "+(num1+num2));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdditionModified n = new AdditionModified();
		n.display();

	}

}
