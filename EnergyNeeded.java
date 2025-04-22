import java.util.Scanner;
public class EnergyNeeded {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter the amount of water in kilograms: ");
	double waterKilogram = keyboardInput.nextDouble();

	System.out.print("Enter the initial temperature: ");
	double initialTemperature = keyboardInput.nextDouble();

	System.out.print("Enter the Final temperature: ");
	double finalTemperature = keyboardInput.nextDouble();

	double energyNeeded = waterKilogram * (finalTemperature - initialTemperature) * 4184;

	System.out.println("The energy needed is: " + energyNeeded);

	}
}