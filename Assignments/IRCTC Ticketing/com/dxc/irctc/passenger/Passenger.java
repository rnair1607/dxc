package com.dxc.irctc.passenger;
import java.util.*;
import com.dxc.irctc.dao.*;
import com.dxc.irctc.model.*;




public class Passenger 
{
	public Passenger() 
	{
		
		
	}

	public static void main(String[] args) 
	{
		TicketDAO ticketDAO = new TicketDAOImpl();
		
		while(true) 
		{
			System.out.println("IRCTC Ticket Booking:");
			System.out.println("*********************");
			System.out.println("1. Book a Ticket");
			System.out.println("2. View booked tickets");
			System.out.println("3. EXIT");
			
			Scanner sc = new Scanner(System.in);
			int choice = 0;
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			
			case 1: 
				System.out.println("Enter the PNR: ");
				int pnr = sc.nextInt();
				System.out.println("Enter the Passenger Name: ");
				String passengerName = sc.next();
				System.out.println("Enter your preferred berth: ");
				String berth = sc.next();
				System.out.println("Fare: ");
				int fare = sc.nextInt();
				
				Ticket ticket = new Ticket(pnr,passengerName,berth,fare);
				ticketDAO.addTicket(ticket);
				break;
				
			case 2:
				System.out.println(ticketDAO.getAllTickets());
				break;
				
			case 3:
				System.out.println("Thanks for using our app!");
				System.exit(0);
				
			default:
				
				System.out.println("Invalid selection");
				
					
				
			}
		}

	}

}
