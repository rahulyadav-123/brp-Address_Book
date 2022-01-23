package utility;

import java.security.Provider.Service;
import java.util.List;
import java.util.Scanner;
import Model.Person;
import controller.AddressBookController;

public class AddressBookClient {
	public AddressBookController addressBookController= new AddressBookController();
	public Utility utility= new Utility();
	Person person = new Person();
	Scanner sc= new Scanner(System.in);
		
	public void createcontact() {
		String firstname = utility.stringInput("firstname");
		String lastname = utility.stringInput("lastname");
		String cityname = utility.stringInput("cityname");
		String phoneNumber = utility.stringInput("PhoneNumber");
		
			
		person = new Person(firstname,lastname,cityname,phoneNumber);
		addressBookController.addContact(person);
		
		System.out.println("contact created");
		
	}
		
		
	public void view() {
		List<Person> personList=addressBookController.viewContact();
		for(Person p:personList) {
			System.out.println(p);
		}
	}
	public void update() {

		System.out.println("Enter first name");
		String firstName=sc.next();
		System.out.println("Enter last name");
		String lastName=sc.next();
		int result=addressBookController.updateController(firstName,lastName);
		if(result==1) {
			System.out.println("Select field to update details");
			System.out.println(" 1-FirstName\n 2-LastName\n 3-City\n 4-phoneNumber");
			int ch =sc.nextInt();
			switch(ch) {
			case 1:System.out.println("Enter New Data");
			       String name1=sc.next();
			       int result1=addressBookController.updateController(ch,name1);
			       if(result1==1) {
			    	   System.out.println(" Updated SuccessFully");
			       }
			       break;
					
			case 2:System.out.println("Enter New Data");
	                String name2=sc.next();
	                int result2=addressBookController.updateController(ch,name2);
	                if(result2==1){
		    	        System.out.println(" Updated SuccessFully");
		            }
	                       break;
			case 3:System.out.println("Enter New Data");
		               String city=sc.next();
		               int result3=addressBookController.updateController(ch,city);
		               if(result3==1) {
			    	   System.out.println(" Updated SuccessFully");
			       }
		               break;
			case 4:System.out.println("Enter New Data");
	                       String phoneNumber=sc.next();
	                       if(utility.regex1(phoneNumber)==1) {
	                         int result4=addressBookController.updateController(ch,phoneNumber);
	                         if(result4==1)
	                      {
			    	        System.out.println("Updated SuccessFully");
			             }
	                       }else {
	            	             System.out.println("Invalid PhoneNumber Enter Upto 5 digit");
	                       }
	                       break;
	                       default:System.out.println("Invalid Choice");
			}
		}
		else {
			System.out.println("Invalid choice");
		     }

	}
		

	public void delete()
	{
		System.out.println("Enter lastname of person to Delete contact");
		String name=sc.next();
		int result=addressBookController.deletecontact(person,name);
		if(result==1) {
		System.out.println(" Deleted Successfully");
		}else {
		System.out.println(name+" Name is not present in the list");
	}
	
 }

}
	
	
	
	
	
	


