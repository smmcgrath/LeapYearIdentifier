import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your year: ");
		
		int year = input.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println("Leap Year!");
		}
		
		if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			System.out.println("Leap Year!");
		}
		else
			System.out.println("Not a Leap Year");
		
		input.close();
		
	}//end main method

}//end class
