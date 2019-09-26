package assignment;
import java.util.Scanner;

public class LeapYear {
	
	Scanner sc = new Scanner(System.in);
	int year;
	
	public void display() {
		
		System.out.print("Enter the year: ");
		year = sc.nextInt();
		
		if( year% 400 == 0) {
			if( year%100 == 0 ) {
				if( year%4 == 0 ) {
					System.out.println("The year is Leap Year.");
				}
			
			}
		}
		else {
			System.out.println("The year is not a Leap Year.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear n = new LeapYear();
		n.display();

	}

}
