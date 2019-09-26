package dataTypes;
import java.util.Scanner;

public class Scanin {
	Scanner sc = new Scanner(System.in);
	int age;
	String personName;
	
	public void display() {
		
		System.out.print("Enter your name: ");
		personName = sc.next();
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		System.out.println("Your age is: "+age);
		System.out.println("Your name is: "+personName);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanin n = new Scanin();
		n.display();
		
		

	}

}
