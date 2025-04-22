import java.util.Scanner;
public class NegativeNum {
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter the First number: ");
	int numOne = keyboardInput.nextInt();

	System.out.print("Enter the Second number: ");
	int numTwo = keyboardInput.nextInt();

	System.out.print("Enter the Third number: ");
	int numThree = keyboardInput.nextInt();

	System.out.print("Enter the Fourth number: ");
	int numFour = keyboardInput.nextInt();

	System.out.print("Enter the Fifth number: ");
	int numFive = keyboardInput.nextInt();

	int zeroCounter = 0 ;

	int positiveCounter = 0;

	int negativeCounter = 0;

		if (numOne == 0) {
		zeroCounter++;
		}

		if (numTwo == 0) {
		zeroCounter++;
		}

		if (numThree == 0) {
		zeroCounter ++;
		}

		if (numFour == 0) {
		zeroCounter++;
		}

		if (numFive == 0) {
		zeroCounter ++;
		}
	System.out.printf("%nThe number of zeros you entered is: %d %n", zeroCounter);

		if (numOne > 0) {
		positiveCounter++;
		}

		if (numTwo > 0) {
		positiveCounter++;
		}

		if (numThree > 0) {
		positiveCounter++;
		}

		if (numFour > 0) {
		positiveCounter++;
		}

		if (numFive > 0) {
		positiveCounter++;
		}
	System.out.printf("The number of positive numbers you entered is: %d %n", positiveCounter);


		if (numOne < 0) {
		negativeCounter++;
		}

		if (numTwo < 0) {
		negativeCounter++;
		}

		if (numThree < 0) {
		negativeCounter++;
		}

		if (numFour < 0) {
		negativeCounter++;
		}

		if (numFive < 0) {
		negativeCounter++;
		}
	System.out.printf("The number of negative numbers you entered is: %d", negativeCounter);

	}
}