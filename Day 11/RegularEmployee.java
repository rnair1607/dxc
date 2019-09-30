package pack1;

public class RegularEmployee extends Employee {

	
	private int salary;
	private int bonus;
	public RegularEmployee() {
		// TODO Auto-generated constructor stub
	}

	public RegularEmployee(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + ", Salary=" + getSalary()
				+ ", Bonus=" + getBonus() + ", Employee ID=" + getEmployeeId() + ", Employee Name="
				+ getEmployeeName() + "]";
	}
	
	

}
