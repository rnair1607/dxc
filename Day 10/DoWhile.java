package loop;
import java.util.Scanner;

public class DoWhile {
	
	Scanner sc = new Scanner(System.in);
	int num = 0;
	int sum = 0;
	int choice = 0;
	int count = 0;
	
	public void display() {
		do {
			
			System.out.println("Please enter number(0-100) "+(++count)+ " : ");
			num = sc.nextInt();
			if( num<0 ) {
				System.out.println("Negative number not allowed");
				--count;
				System.out.println("Sum is : "+sum+"\n Thank you!");
				System.exit(0);
				continue;
				
			}
			
			sum += num;
			System.out.println("Do you want to continue(1 to continue, any number to exit");
			choice = sc.nextInt();
		}while( choice == 1);
		
		System.out.println("Your sum is: "+sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoWhile n = new DoWhile();
		n.display();

	}

}
