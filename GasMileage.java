//Use Sentinel controlled iteration to prompt user for input.
	//Prompt the user to input the miles driven. (integer).
	//Prompt the user to input the gallon used for each trip. (integer).
//Calculate and display the miles per gallon obtained for each trip. 
	//Divide the miles driven with the gallons used each trip. (Convert to float).
//Calculate and display the combined miles per gallon obtained for all trips up to this point.
	//Add the miles per gallon for all the trips. (Convert to float).

import java.util.Scanner;
public class GasMileage {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	int milesDriven = 0;
	int milesDrivenSafe = 0;
	int gallonsEachTrip = 0;
	double gallonsEachTripSafe = 0;
	double milesPerGallon = 0;

	do {
	System.out.print("Enter -0 if you wish to stop this action. To continue Enter miles driven: ");
	milesDriven = keyboardInput.nextInt();
	milesDrivenSafe = milesDrivenSafe + milesDriven;

	System.out.print("Enter gallons used for each trip: ");
	gallonsEachTrip = keyboardInput.nextInt();
	gallonsEachTripSafe = gallonsEachTripSafe + gallonsEachTrip;

	System.out.print("Miles Per Gallon: " + milesPerGallon);
	} while (milesDriven != -0);
	


	//if (milesDriven != -0) {
	//milesPerGallon = gallonsEachTripSafe / gallonsEachTrip;
	//}
	//System.out.print("Miles Per Gallon: " + milesPerGallon);



	}
}

