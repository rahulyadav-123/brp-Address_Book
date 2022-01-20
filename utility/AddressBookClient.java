package utility;

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
		
		System.out.println("Update contact via\n 1-Firstname \n 2-lastname \n 3-City \n 4-phoneNumber");
		int data=sc.nextInt();
		switch(data){
			      case 1: System.out.println("Enter First name of person");
			              String name=sc.next();
			              int result =addressBookController.updateContact(person,name);
			              if(result==1) 
			              {
			      			    System.out.println("Enter New Data");
			      			    String data1=sc.next();
			      			    int r=addressBookController.updateContact(data1,person); 
			      			    if(r==1) 
			      			    {
			      				      System.out.println(" Updated Successfully");
			      			    }
			      		  }
			              else  {
			      			System.out.println(name+" Name is not present in the list");
			      		  }
			              break;
			      case 2: System.out.println("Enter lastname name of person");
	              		  String name1=sc.next();
	              		  int result1 =addressBookController.updateContact(person,name1);
	              		  if(result1==1) 
	              		{
	              			  System.out.println("Enter New Data");
	              			  String data1=sc.next();
	              			  int r=addressBookController.updateContact(data1,person); 
	              			  if(r==1) 
	      			    {
	      				      System.out.println(" Updated Successfully");
	      			    }
	      		  }
	              else  {
	      			System.out.println(name1+" Name is not present in the list");
	      		  }
	              break;
	     
			     
			      case 3: System.out.println("Enter city of person");
	                      String name2=sc.next();
	                      int result2 =addressBookController.updateContact(person,name2);
	                      if(result2==1) {
	                    	   System.out.println("Enter New Data");
			      			    String data1=sc.next();
			      			    int r=addressBookController.updateContact(data1,person); 
			      			    if(r==1) 
			      			    {
			      				      System.out.println(" Updated Successfully");
			      			    }
	               		    }
	                       else
	                       {
	               			System.out.println(name2+" Name is not present in the list");
	               		   }
	                       break;
			     
			      case 4: System.out.println("Enter phoneNumber of person");
                           String name3=sc.next();
                           int result3 =addressBookController.updateContact(person,name3);
                           if(result3==1)
                           {
                        	   System.out.println("Enter New Data");
			      			   String data1=sc.next();
			      			    if(utility.regex1(data1)==1)
			      			    {
			      			    	int r=addressBookController.updateContact(data1,person); 
				      			    if(r==1)
				      			    {
				      				      System.out.println(" Updated Successfully");
				      			    }
			      			  }
			      			  else 
			      			    {
			      			   	System.out.println("Enter proper phoneNumber upto 5-Digit");
			      			    }
			      			    
                   		   }
                           else
                           {
                   			System.out.println(name3+" PhoneNumber is not present in the list");
                   		   }
                           break;
                           
                  default:  System.out.println("Inavalid Choice");
		  }
	}
		
		

	public void delete()
	{
	System.out.println("Enter FirstName of person to Delete contact");
	String name=sc.next();
	int result=addressBookController.deletecontact(person,name);
	if(result==1) {
		System.out.println(" Deleted Successfully");
	}else {
		System.out.println(name+" Name is not present in the list");
	}
	
 }

}
	
	
	
	
	
	


