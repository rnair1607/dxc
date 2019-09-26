package dataTypes;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		/*System.out.println(number);*/
		
		Demo m = new Demo();
		m.myMethod();
	}
	int number = 10;
	
	public void myMethod() {
		System.out.println("Hi");
	}


}
