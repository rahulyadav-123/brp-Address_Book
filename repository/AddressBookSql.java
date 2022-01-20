package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AddressBookSql {
	
public static Connection getconnection() {
		Connection Connection =null;
		try {
			Connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/sample_address_book","root","Rahulyadav@123");
			
			
            } catch (SQLException throwable) {
			
			throwable.printStackTrace();
		}
		return Connection;
	}
		
}
