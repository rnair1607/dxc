package arryalist;
import java.util.List;
import java.util.ArrayList;

public class ArrayPract {

	public static void main(String[] args) {
		
		List names = new ArrayList();
		
		names.add("Rahul");
		names.add("Ronak");
		names.add("Rohan");
		names.add("Ronit");
		names.add("Roshan");
		names.add("Roman");
		
		names.remove("Roman");
		System.out.println(names.contains("Roshan"));
		System.out.println(names.get(2));
		System.out.println(names.isEmpty());
		System.out.println(names);
		

	}

}
