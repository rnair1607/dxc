package oopsDemo;

public class Main {

	public static void main(String[] args) {
		RailwayBooking passenger1 = new RailwayBooking();
		RailwayBooking passenger2 = new RailwayBooking("323143","Rahul",4345,"b1");
		RailwayBooking passenger3 = new RailwayBooking("323143",4345);
		RailwayBooking passenger4 = new RailwayBooking("Rahul","b1");
		
		passenger2.setPassengerName("Ronak");
		
		passenger1.display();
		System.out.println("-----------");
		passenger2.display();
		System.out.println("-----------");
		passenger3.display();
		System.out.println("-----------");
		passenger4.display();
		
		
		
	}
}
