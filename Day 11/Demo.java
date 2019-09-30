package pack1;

class Employee1 {
	public void finalize() {
		System.out.println("Object reclaimed.");
	}
	
}

public class Demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 e1 = new Employee1();
		System.out.println("Object created.");
		Employee1 e2 = new Employee1();
		e1 = e2;
		System.gc();

	}

}
