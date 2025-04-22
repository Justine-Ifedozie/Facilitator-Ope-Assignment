import java.util.Scanner;
public class Commann {
	public static void main(String[] args){
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter a number to be used as a Radius: ");
	int userRadius = keyboardInput.nextInt();

	System.out.printf("Circle Daimeter: %d %n", (userRadius + userRadius));

	System.out.printf("Circle Circumference: %f %n", 3.14159 * (userRadius + userRadius));

	System.out.printf("Circle Area: %f  %n", 3.14 * (userRadius * userRadius));

	}
}