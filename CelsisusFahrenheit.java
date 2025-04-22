import java.util.Scanner;
public class CelsisusFahrenheit {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
	System.out.print("Enter a Celsius degree: ");
	double celsius = keyboardInput.nextDouble();

	double fahrenheit = (9.0 / 5.0 ) * celsius + 32.0;

	System.out.printf("%.0f Celsius is %.1f Fahrenheit", celsius, fahrenheit);




	}
}