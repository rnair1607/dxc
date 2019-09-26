package assignment;
import java.util.Scanner;

public class VowelPract {
	
	Scanner sc = new Scanner(System.in);
	int ch;
	
	public void display() {
		System.out.print("Enter the character: ");
		ch = sc.next().charAt(0);
		
		if( ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') {
			System.out.println("It's a vowel.");
		}
		else {
			System.out.println("It's a consonant. ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VowelPract n = new VowelPract();
		n.display();

	}

}
