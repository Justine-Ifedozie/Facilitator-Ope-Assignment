import java.util.Scanner;
public class PoundsIntoKilogram {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter a number in Pounds: ");
	double numEntered = keyboardInput.nextDouble();

	double kiloGram = numEntered * 0.454;
	System.out.print(numEntered + " Pounds is " + kiloGram + " Kilograms");




	}
}