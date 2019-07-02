import java.util.Scanner;

public class ValidationMethods {

	public static boolean isValidName(String input) {
		return input.matches("[A-Z][a-zA-Z]{1,29}");
	}
	
	public static String getValidName(Scanner scnr){
		boolean isValid = false;
		String input;
		
		do {
			System.out.println("Please enter a valid Name): ");
			input = scnr.nextLine();
			
			if (input.matches(("[A-Z][a-zA-Z]{1,29}"))){
				isValid = true;
			}else {
				System.out.println("Sorry, name is not valid!");
				isValid = false;
			}
		} while (!isValid);
		
		return input;
		
		
		
	}
	
	public static String validEmail(Scanner scnr) {
		boolean isValid = false;
		String email = " ";
		
		System.out.println(email);
		email = scnr.nextLine();
		
		do {
			System.out.println("Please enter a valid email(ex.james@james.com) : ");
			email = scnr.nextLine();
			
			if (email.matches(("[a-zA-Z0-9]{5,30}[@][a-zA-z]{5,10}[.][a-zA-Z]{2,3}"))){
				isValid = true;
			}else {
				System.out.println("Sorry, email is not valid!");
				isValid = false;
			}
		} while (!isValid);
		
		return email;
		
				
		
	}
	
	public static String validPhoneNum(Scanner scnr) {
		boolean isValid = false;
		String phone = " ";
		
		System.out.println(phone);
		phone = scnr.nextLine();
		
		do {
			System.out.println("Please enter a valid phone number (ex. xxx-xxx-xxxx): ");
			phone = scnr.nextLine();
			
			if (phone.matches(("\\d{3}-\\d{3}-\\d{4}"))){
				isValid = true;
			}else {
				System.out.println("Sorry, phone number is not valid!");
				isValid = false;
			}
		} while (!isValid);
		
		return phone;
			
	}
	
	public static String validDate(Scanner scnr) {
		boolean isValid = false;
		String date = " ";
		
		System.out.println(date);
		date = scnr.nextLine();
		
		do {
			System.out.println("Please enter a valid date (ex. mm/dd/yyy): ");
			date = scnr.nextLine();
			
			if (date.matches(("\\d{2}[/]\\d{2}[/]\\d{4}"))){
				isValid = true;
			}else {
				System.out.println("Sorry, date is not valid!");
				isValid = false;
			}
		} while (!isValid);
		
		return date;		
		
	}
	
	public static String validhtml(Scanner scnr) {
		boolean isValid = false;
		String html = " ";
		
		System.out.println(html);
		html = scnr.nextLine();
		
		do {
			System.out.println("Please enter a valid html): ");
			html = scnr.nextLine();
			
			if (html.matches(("[<][a-zA-Z0-9]+[>] [<][/][a-zA-Z0-9]+[>]"))){
				isValid = true;
			}else {
				System.out.println("Sorry, html is not valid!");
				isValid = false;
			}
		} while (!isValid);
		
		return html;		
	}

}
