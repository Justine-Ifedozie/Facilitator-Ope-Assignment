import java.util.Scanner;
public class FeetAndMeters {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter a value for feet: ");
	double feetEntered = keyboardInput.nextDouble();

	double metersConverted = feetEntered * 0.305;

	System.out.print(feetEntered + " feet is " + metersConverted + " meters");

	}
}