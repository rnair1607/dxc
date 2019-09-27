package oopsDemo;

public class RailwayBooking {

	String pnr;
	String passengerName;
	int fare;
	String berth;
	
	public RailwayBooking() {
		
		pnr ="Not Available";
		passengerName = "Not Available";
		fare = 0;
		berth = "Not Available";
		
	}

	public RailwayBooking(String pnr, String passengerName, int fare, String berth) {
		this();
		this.pnr = pnr;
		this.passengerName = passengerName;
		this.fare = fare;
		this.berth = berth;
	}

	public RailwayBooking(String pnr, int fare) {
		this();
		this.pnr = pnr;
		this.fare = fare;
	}

	public RailwayBooking(String passengerName, String berth) {
		this();
		this.passengerName = passengerName;
		this.berth = berth;
	}
	
	public void display() {
		System.out.println("PNR: "+pnr);
		System.out.println("Passenger Name: "+passengerName);
		System.out.println("Fare: "+fare);
		System.out.println("Berth: "+berth);
	}
	

	public String getPnr() {
		return pnr;
	}

	public int getFare() {
		return fare;
	}

	public String getBerth() {
		return berth;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	
	
	
	
	
	
	
}
