package Model;
public class Person {
	public int id;
	public String firstName;
	public String lastName;
	public String cityName;
	public String phoneNumber;
	
	
	public Person(String firstname, String lastname, String cityname, String phoneNumber) {
		this.firstName=firstname;
		this.lastName=lastname;
		this.cityName=cityname;
		this.phoneNumber=phoneNumber;
		
	}
	
	public Person() {
		
	}
	public void Person1(String firstname, String lastname, String cityname, String phoneNumber) {
		this.firstName=firstname;
		this.lastName=lastname;
		this.cityName=cityname;
		this.phoneNumber=phoneNumber;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	@Override
	public String toString() {
		return "Name:" + this.firstName + 
				" " + this.lastName + "\nCity:" + this.cityName + "\nMobileNumber:"+ this.phoneNumber + ""; 
	
	
	
	}
}