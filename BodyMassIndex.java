import java.util.Scanner;
public class BodyMassIndex {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter your weight in pound: ");
	double weightPounds = keyboardInput.nextDouble();

	System.out.print("Enter your height in inches: ");
	double heightInches = keyboardInput.nextDouble();

	double weightKilograms = weightPounds * 0.45359237;

	double heightMeters = heightInches * 0.0254;

	double heightMetersSquare = heightMeters * heightMeters;

	double bMI = weightKilograms / heightMetersSquare;

	System.out.printf("Your BMI is: %.4f", bMI);

	}
}