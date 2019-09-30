package pack1;
import java.util.*;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "String:is:immutable:whereas:StringBuffer";
		StringTokenizer st = new StringTokenizer(message,":");
	
		
		int totalToken = st.countTokens();
		int count = 0;
		
		while(st.hasMoreTokens()) {
			
			count++;
			System.out.println(count+" : "+st.nextToken());
			
		}
		
		System.out.println("Total words: "+totalToken);
	}

}
