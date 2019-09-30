package pack1;

public class VarArgs {
	
	public static int sum(int...n) {
		int sum = 0;
		
		for(int i:n) {
			sum+=i;
					
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(9,8));
		System.out.println(sum(9,9,9,9,9));
		System.out.println(sum(6,6,6,6,6));
		
	}

}
