package controller;

import java.util.List;

import Model.Person;
import Service.AddressBookService;


public class AddressBookController {
	private AddressBookService Service= new AddressBookService();
	public void addContact(Person person) 
	{
		Service.addcontactService(person);
	}

	public List<Person> viewContact() 
	{
		return Service.viewcontactservice();
	}

	 public int updateController(String firstname, String lastName)
	{
		int result =Service.updateService(firstname,lastName);
		return result;
	}

	public int updateController(int ch,String name) 
	{
		int result=Service.updateService(ch,name);
		return result;
	}

	public int deletecontact(Person person, String name) 
	{
		int result=Service.deleteService(person,name);	
		 return result;
		
	}


}
	
	

	

