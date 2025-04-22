import java.util.Scanner;
public class integerAddition {
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int enteredNum = keyboardInput.nextInt();

	int firstDigitPicked = enteredNum / 100;

	int secondDigit = enteredNum % 100;
	int secondDigitPicked = secondDigit / 10;

	int lastDigitPicked = enteredNum % 10;

	int sumOfDigits = firstDigitPicked + secondDigitPicked + lastDigitPicked;

	System.out.println("The sum of the digits you entered is : " + sumOfDigits);

	} 
}