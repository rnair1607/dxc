package com.user.dao;
import java.sql.*;

import com.user.dbcon.*;
import com.user.model.*;

public class LoginDAOImpl implements LoginDAO {
	
	Connection connection = DBConnection.getConnection();
	private static final String FETCH_DATA_USERS = "select * from users where userName=? AND password=?";
	
	public LoginDAOImpl() 
	{
		
	}
	
	
	
	public boolean validate(String userName,String password) 
	{
		boolean userExist = false;
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(FETCH_DATA_USERS);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);
			
			ResultSet res = preparedStatement.executeQuery();
			if(res.next()) {
				userExist = true;
				
				
			}
			else {
				userExist = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userExist;
		
	}

	
}
