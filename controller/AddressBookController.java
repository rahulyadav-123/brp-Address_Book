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

	public int updateContact(Person person,String name)
	{
		 int result=Service.updateService(person,name);	
		 return result;
	}


	public int updateContact(String data1, Person person) 
	{
		int result=Service.updateService(data1,person);	
		return result;
	}

	public int deletecontact(Person person, String name) 
	{
		int result=Service.deleteService(person,name);	
		 return result;
		
	}
}
	
	

	

