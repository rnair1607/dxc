package pack1;

public class Student {
	
	private String name;
	private int regNo;
	
	

	public Student(String name, int regNo) {
		
		this.name = name;
		this.regNo = regNo;
	}

	

	public Student(int regNo) {
		
		this.regNo = regNo;
	}

	

	public Student(String name) {
		super();
		this.name = name;
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRegNo() {
		return regNo;
	}



	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}



	public static void main(String[] args) {
		
		

	}

}
