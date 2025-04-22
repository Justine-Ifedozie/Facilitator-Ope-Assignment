import java.util.Scanner;
public class Acceleration {
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter the starting velocity Vo in meters/second: ");
	double startingVelocity = keyboardInput.nextDouble();

	System.out.print("Enter the ending velocity V1 in meters/second: ");
	double endingVelocity = keyboardInput.nextDouble();

	System.out.print("Enter the time span t in seconds: ");
	double timeSpan = keyboardInput.nextDouble();

	double averageAcceleration = (startingVelocity - endingVelocity) / timeSpan;

	System.out.printf("The average acceleration is: %.4f", averageAcceleration);


	}
}