package oopsDemo;

public class Passenger {

	String pnrNumber;
	String mobileNumber;
	String passengerName;
	int fare;
	int cgst = 100;
	int sgst = 100;
	
	public void bookTicket() {
		
		pnrNumber = "1923356";
		mobileNumber = "9909942544";
		passengerName = "Rahul Nair";
		fare = 1900 + sgst + cgst;
		System.out.println(passengerName+", your ticket has been booked with the PNR: "+pnrNumber+" and the mobile number provided is: "+mobileNumber);
		System.out.println("The total fare for the trip is: "+fare);
		
		
	}
	
	public void cancelTicket() {
		
		pnrNumber = "1923365";
		mobileNumber = "9909942545";
		passengerName = "Reghu Nair";
		fare = 1450 + sgst + cgst;
		System.out.println(passengerName+", your ticket has been cancelled with the PNR: "+pnrNumber+" and the mobile number provided is: "+mobileNumber);
		System.out.println("The total refund you'll recieve is: "+fare);
		
		
	}
	
	public static void main(String[] args) {
		
		Passenger passenger = new Passenger();
		passenger.bookTicket();
		System.out.println("--------------------------------");
		passenger.cancelTicket();
		
	}

}
