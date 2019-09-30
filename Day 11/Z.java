package pack1;

public class Z {
	
	W w = new W();
	{
		System.out.println("Instance");
	}
	
	static {
		System.out.println("Static");
	}
	
	public Z() {
		System.out.println("Z cons");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		new Z();
		new Z();
	}

}
