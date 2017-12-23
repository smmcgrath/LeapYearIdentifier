import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		//setting up the scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your year: ");
		
		//storing users next inputed integer 
		int year = input.nextInt();
		
		//logic of the if statement ensures that
		//the following step will only be carried 
		//out if year is divisible by four evenly
		//and not divisible by 100 evenly 
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println("Leap Year!");
		}
		
		if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			System.out.println("Leap Year!");
		}
		else
			System.out.println("Not a Leap Year");
		
		//close the scanner
		input.close();
		
	}//end main method

}//end class
