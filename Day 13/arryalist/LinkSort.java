package arryalist;
import java.util.*;

public class LinkSort {

	public static void main(String[] args) {
		
		
		List names = new Vector();
		names.add("Rahul");
		names.add("Roman");
		names.add("Roshan");
		names.add("Raunak");
		names.add("Romi");
		
		Collections.sort(names);
		System.out.println(names);
		
		int i = Collections.binarySearch(names, "Rahul");
		System.out.println(i);
		

	}

}
