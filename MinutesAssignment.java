import java.util.Scanner;
public class MinutesAssignment {
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
	System.out.print("Enter the minutes: ");
	long minutesEntered = keyboardInput.nextLong();

	long newHours = minutesEntered / 60;

	long newDays = newHours / 24;

	long newYears = newDays / 365;

	long remainderDays = newDays % 365;

	System.out.print("You entered: " + minutesEntered + " which is approximately " + newYears + " and " + remainderDays + " days");

	}
}