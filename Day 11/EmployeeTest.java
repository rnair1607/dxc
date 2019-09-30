package pack1;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RegularEmployee regular = new RegularEmployee(1002,"Rahul");
		regular.setBonus(5000);
		regular.setSalary(40351);
		System.out.println(regular);
		
		ContractEmployee contract = new ContractEmployee(13023,"Tufail");
		contract.setContractDuration(3);
		contract.setPayPerHour(2000);
		System.out.println(contract);
		
		
		

	}

}
