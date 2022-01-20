package utility;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Utility {
	
	private Scanner scanner=new Scanner(System.in);
	
	public String stringInput(String message) {
		displayInputInfo(message);
		String value=scanner.nextLine();
		return value;
		
		
	}
	public String stringInput1(String message) {
		displayInputInfo(message);
		String value=scanner.nextLine();
		int r=regex1(value);
		if(r==0) {
			System.out.println("Invalid number Enter the proper phonenumber");
			stringInput1(message);
		}
		return value;
		}
	
	public int regex1(String value) {
		int r=0;
		String regex1=("^[1-9][0-9]{4}$");
		Pattern pattern=Pattern.compile(regex1);
		Matcher match=pattern.matcher(value);
		if(match.matches()) {
			r=1;
			
		}
		return r;
		
		
	}
	
	private void displayInputInfo(String message) {
		System.out.println("Enter"+ message +":");
	}

}
