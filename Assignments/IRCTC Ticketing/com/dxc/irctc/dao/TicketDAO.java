package com.dxc.irctc.dao;
import com.dxc.irctc.model.*;
import java.util.*;

public interface TicketDAO
{
	
	
	public Ticket getTicket(int pnr);
	public List<Ticket> getAllTickets();
	public void addTicket(Ticket ticket);
	public Ticket cancelTicket(int pnr);
	public void updateTicket(Ticket ticket);
	
}
