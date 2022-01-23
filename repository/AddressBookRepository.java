package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.Person;

public class AddressBookRepository {
	
	private List<Person> addressBooklist= new ArrayList<>();
	
	int s=0;
	
	public void savecontact(Person Person1) {
		
	Connection connection = AddressBookSql.getconnection();
	String sql = String.format("insert into contacts(Firstname,lastname,city,phonenumber)"
							+ " values('%s','%s','%s','%s')"
						,Person1.firstName,Person1.lastName,Person1.cityName,Person1.phoneNumber);
	
	try {
		Statement statement = connection.createStatement();
		statement.executeUpdate(sql);
	} 
	catch (Exception e) {
		e.printStackTrace();
	}
		
		
}
	
	public List<Person> getaddressBooklist(){
		Connection connection=AddressBookSql.getconnection();
		String sql = "select * from contacts";
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery(sql);
			while(resultset.next()) {
				
				String Firstname = resultset.getString(2);
			    String Lastname =  resultset.getString(3);
				String city = resultset.getString(4);
				String phoneNumber =resultset.getString(5);
				addressBooklist.add(new Person(Firstname,Lastname,city,phoneNumber));
				}
			
        } catch (SQLException e) {
		
		e.printStackTrace();
			
		}
		return addressBooklist;
	}
	
	public int updateRepository1(String firstname , String lastname)
	{
		int result=0;
		Connection connection=AddressBookSql.getconnection();
		String sql = "select * from contacts";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery(sql);
			while(resultset.next()) {
				 if(resultset.getString(2).equalsIgnoreCase(firstname))
				 {
					 
					  s= resultset.getInt(1);
					  result=1;
					  return result;
				  }
				 
				 if(resultset.getString(3).equalsIgnoreCase(lastname))
				  {
					 
					  s= resultset.getInt(1);
					  result=1;
					  return result;
				  }
				 
			}
		}
				 
					 
				 catch (SQLException e) {
			
			e.printStackTrace();
		}
			
   	return result;
 }

	public int updateRepository1(int ch,String name) {
		int result=0;
		Connection connection=AddressBookSql.getconnection();
		if(ch==1)  {
		
		String sql= "update contacts set Firstname=? where id=?";
		
		try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setString(1, name);
				preparedStatement.setInt(2, s);
				preparedStatement.executeUpdate();
				result=1;
			
			}catch (SQLException e) {
			
				e.printStackTrace();
				
			}
		}
		if (ch==2) {
			
			String sql= "update contacts set lastname=? where id=?";
			
			try {
					PreparedStatement preparedStatement=connection.prepareStatement(sql);
					preparedStatement.setString(1, name);
					preparedStatement.setInt(2, s);
					preparedStatement.executeUpdate();
					result=1;
				
				}catch (SQLException e) {
				
					e.printStackTrace();
					
				}
			}
		
		
			if (ch==3) {
				
				String sql2  = "update contacts set city=? where id=?";
				
				try {
						PreparedStatement preparedStatement=connection.prepareStatement(sql2);
						preparedStatement.setString(1, name);
						preparedStatement.setInt(2, s);
						preparedStatement.executeUpdate();
						result=1;
					
						}catch (SQLException e) {
					
							e.printStackTrace();
					
					}
			}
				if (ch==4) {
					
					String sql3 = "update contacts set phoneNumber=? where id=?";
					
				try {
						PreparedStatement preparedStatement=connection.prepareStatement(sql3);
						preparedStatement.setString(1, name);
						preparedStatement.setInt(2, s);
						preparedStatement.executeUpdate();
						result=1;
						
						}catch (SQLException e) {
						
							e.printStackTrace();
							
						}
				}
					return result;
		
			}
	
		
	public int deleteData(Person person, String name) 
			{
				int result=0;
				Connection connection=AddressBookSql.getconnection();
				 String sql=String.format("select * from contacts");
		    	try {
		    		Statement statement=connection.createStatement();
					ResultSet resultset=statement.executeQuery(sql);
					
					  while(resultset.next()) 
					  {
						  if(resultset.getString(3).equalsIgnoreCase(name))
						  {
							  String sql1=String.format("delete from contacts where lastName=?");
							  PreparedStatement preparedStatement=connection.prepareStatement(sql1);
							  preparedStatement.setString(1, name);
							  preparedStatement.executeUpdate();
							  result=1;
						  }
					  }
					} catch (SQLException e) {
					  e.printStackTrace();
					}
					
					return result;
			}

	
	}

		

