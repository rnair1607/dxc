package com.dxc.irctc.dao;

import com.dxc.irctc.dbcon.*;

import java.util.*;
import java.sql.*;

import com.dxc.irctc.model.Ticket;


public class TicketDAOImpl implements TicketDAO 
{

	Connection connection = DBConnection.getConnection();
	private static final String FETCH_TICKET_ALL = "select* from irctc";
	
	public TicketDAOImpl() 
	{
		
		
		
		
	}
	
	List<Ticket> allTicket = new ArrayList<Ticket>();

	@Override
	public Ticket getTicket(int pnr) 
	{
		
		List<Ticket> allTicket = new ArrayList<Ticket>();
		try {
			Statement stat = connection.createStatement();
			ResultSet res = stat.executeQuery(FETCH_TICKET_ALL);
			while(res.next()) {
				
				Ticket ticket = new Ticket();
				ticket.setPnr(res.getInt(1));
				ticket.setPassengerName(res.getString(2));
				ticket.setPreferredBerth(res.getString(3));
				ticket.setFare(res.getInt(4));
				allTicket.add(ticket);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Ticket ticket = allTicket.stream().filter(n->n.getPnr()==pnr).findFirst().get();
		return ticket;
	}

	@Override
	public List<Ticket> getAllTickets() 
	{
		List<Ticket> allTicket = new ArrayList<Ticket>();
		try {
			Statement stat = connection.createStatement();
			ResultSet res = stat.executeQuery(FETCH_TICKET_ALL);
			while(res.next()) {
				
				Ticket ticket = new Ticket();
				ticket.setPnr(res.getInt(1));
				ticket.setPassengerName(res.getString(2));
				ticket.setPreferredBerth(res.getString(3));
				ticket.setFare(res.getInt(4));
				allTicket.add(ticket);
			}
		}
		catch(SQLException e){
			
			e.printStackTrace();
		}
		return allTicket;
	}

	@Override
	public void addTicket(Ticket ticket) 
	{
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into irctc values(?,?,?,?)");
			
			preparedStatement.setInt(1, ticket.getPnr());
			preparedStatement.setString(2, ticket.getPassengerName());
			preparedStatement.setString(3, ticket.getPreferredBerth());
			preparedStatement.setInt(4, ticket.getFare());
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void cancelTicket(int pnr) 
	{
		
		List<Ticket> allTicket = new ArrayList<Ticket>();
		
		
		allTicket.removeIf(g->g.getPnr() == pnr);
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("delete from irctc where pnr = ?");
			preparedStatement.setInt(1, pnr);
			preparedStatement.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		try {
			Statement stat =  connection.createStatement();
			ResultSet res = stat.executeQuery(FETCH_TICKET_ALL);
			while(res.next()) {
				
				Ticket ticket = new Ticket();
				ticket.setPnr(res.getInt(1));
				ticket.setPassengerName(res.getString(2));
				ticket.setPreferredBerth(res.getString(3));
				ticket.setFare(res.getInt(4));
				allTicket.add(ticket);
			}
		}
		catch(SQLException e){
			
			e.printStackTrace();
		}
		System.out.println("The updated Database:");
		System.out.println(allTicket);
	}

	@Override
	public void updateTicket(Ticket ticket) 
	{
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("update irctc set passengerName=?, preferredBerth=?, fare=? where pnr=? ");
			
			preparedStatement.setInt(4, ticket.getPnr());
			preparedStatement.setString(1, ticket.getPassengerName());
			preparedStatement.setString(2, ticket.getPreferredBerth());
			preparedStatement.setInt(3, ticket.getFare());
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
