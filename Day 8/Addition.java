package dataTypes;
import java.util.Scanner;

public class Addition {
	Scanner sc = new Scanner(System.in);
	int firstNum;
	int secondNum;
	
	public void display() {
		
		System.out.print("Enter 1st num: ");
		firstNum = sc.nextInt();
		System.out.print("Enter 2nd num: ");
		secondNum = sc.nextInt();
		System.out.println("Sum is: "+(firstNum+secondNum));
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition n = new Addition();
		n.display();
		
		

	}

}
