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
	public int updateService(String name, String lastName) 
	{
		int result=addressr.updateRepository1(name,lastName);
		return result;
	}

	public int updateService(int ch,String name) {
		int r=addressr.updateRepository1(ch,name);
		return r;
	}

	public int deleteService(Person person, String name)
	{
		int result=addressr.deleteData(person,name);
		return result;
	}


	

}

	
	




	
	


