package assignment;
import java.util.Scanner;


public class NumSwap {
	
	Scanner sc = new Scanner(System.in);
	int num1;
	int num2;

	public void display() {
		System.out.print("a:");
		num1 = sc.nextInt();
		
		System.out.print("b:");
		num2 = sc.nextInt();
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("a: "+num1);
		System.out.println("b: "+num2);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumSwap n = new NumSwap();
		n.display();

	}

}
