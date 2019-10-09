package com.dxc.product.dao;
import java.sql.*;
import com.dxc.product.dbcon.*;
import com.cms.dxc.product.model.*;
import com.dxc.product.dbcon.DBConnection;

public class UsersDAOImpl implements UsersDAO {
	
	Connection connection = DBConnection.getConnection();
	private static final String FETCH_DATA_USERS = "select * from users where userName=? AND password=?";
	
	public UsersDAOImpl() 
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
