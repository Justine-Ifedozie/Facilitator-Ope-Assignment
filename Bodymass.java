import java.util.Scanner;
public class Bodymass {
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter your weight in Kilogram: ");
	int weight = keyboardInput.nextInt();

	System.out.print("Enter your height in Meters: ");
	int height = keyboardInput.nextInt();

	int bMi = (weight / (height * height));
	System.out.printf("Your BMI is: %d %n", bMi);

	System.out.println("\nBMI Categories");
	System.out.printf("Underweight = <18.5 %n");
	System.out.printf("Normal weight = 18.5 - 24.9 %n");
	System.out.printf("Normal weight = 18.5 - 24.9 %n");
	System.out.printf("Overweight = 25 - 29.9");
	System.out.printf("Obesity = BMI of 30 or greater");



	}
}