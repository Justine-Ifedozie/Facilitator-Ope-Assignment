//Use Sentinel controlled iteration to prompt user for input.
	//Prompt the user to input the miles driven. (integer).
	//Prompt the user to input the gallon used for each trip. (integer).
//Calculate and display the miles per gallon obtained for each trip. 
	//Divide the miles driven with the gallons used each trip. (Convert to float).
//Calculate and display the combined miles per gallon obtained for all trips up to this point.
	//Add the miles for all the trips then divide with the . (Convert to float).

import java.util.Scanner;
public class GasMileage {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

//Miles driven and gallons used for each trip.
	int milesDriven = 0;
	int gallonsUsed = 0;

	int milesDrivenCombined = 0;
	double milesPerGallonEachTrip = 0;
	double gallonsTripCombined = 0;
	double milesPerGallonAllTrip = 0;

	do {
	System.out.print("Enter -0 if you wish to stop this action. To continue Enter miles driven: ");
	milesDriven = keyboardInput.nextInt();

	System.out.print("Enter gallons used for each trip: ");
	gallonsUsed = keyboardInput.nextInt();

//Miles per Gallon obtained for each trip.
	milesPerGallonEachTrip = milesDriven / gallonsUsed;
	System.out.println("Miles Per Gallon for each trip is: "+ milesPerGallonEachTrip);

//Miles per Gallon obtained for all trips.
	milesDrivenCombined = milesDrivenCombined + milesDriven; 	
	gallonsTripCombined = gallonsTripCombined + gallonsUsed;
	milesPerGallonAllTrip = milesDrivenCombined / gallonsTripCombined;
	System.out.printf("Miles Per Gallon for all trips: %.3f%n", milesPerGallonAllTrip);

	} while (milesDriven != -0);


	}
}

