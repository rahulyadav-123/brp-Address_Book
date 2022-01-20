package Service;

import java.util.List;
import Model.Person;
import repository.AddressBookRepository;

public class AddressBookService {
	
	private AddressBookRepository addressr = new AddressBookRepository();

	public void addcontactService(Person person) {
		addressr.savecontact(person);
	}
	
	
	public List<Person> viewcontactservice() {
		return addressr.getaddressBooklist();
		
	}
	public int updateService(Person person, String name) 
    {
	     int result=addressr.updateRepository(person,name);
	     return result;
    }
	

	public int deleteService(Person person, String name)
	{
		 		
		int result=addressr.deleteData(person,name);
		return result;
		
	}

	public int updateService(String data1, Person person) 
	{
		int result=addressr.updateRepository(data1,person);
		return result;
		
	}

}

	
	




	
	


