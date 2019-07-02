import java.util.Scanner;

public class Validator {

	public static void main(String[] args) {
		
		
		Scanner scnr = new Scanner(System.in);
		
		//String input = " ";
		
		//String input = scnr.nextLine();
		//boolean valid = ValidationMethods.isValidName(input);
		//System.out.println(valid);
		 ValidationMethods.getValidName(scnr);
		 ValidationMethods.validEmail(scnr);
		 ValidationMethods.validPhoneNum(scnr);
		 ValidationMethods.validDate(scnr);
		 ValidationMethods.validhtml(scnr);
		
		
	}
	
	
}