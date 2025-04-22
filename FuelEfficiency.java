import java.util.Scanner;
public class FuelEfficiency {
	public static void main (String[] args) { 
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter the driving distance: ");
	double drivingDistance = keyboardInput.nextDouble();

	System.out.print("Enter the miles per gallon: ");
	double milesPerGallon = keyboardInput.nextDouble();

	System.out.print("Enter the price per gallon: ");
	double pricePerGallon = keyboardInput.nextDouble();

	double costOfDriving = pricePerGallon * (drivingDistance / milesPerGallon);

	System.out.printf("The cost of driving is: $%.2f", costOfDriving);
	}
}