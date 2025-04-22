import java.util.Scanner; 
public class AirplaneAcceleration { 
	public static void main (String[] args) {
	Scanner keyboardInput =   new Scanner(System.in);

	System.out.print("Enter speed: ");
	double speed = keyboardInput.nextDouble();

	System.out.print("Enter acceleration: ");
	double acceleration = keyboardInput.nextDouble();
	
	double length = (speed * speed) / (2 * acceleration);
	System.out.printf("The minimum runway length needed for an airplane to take off is: %.3f", length);

	}
}