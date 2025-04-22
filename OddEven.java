import java.util.Scanner;
public class OddEven {
	public static void main (String[] args) { 
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int firstNum = keyboardInput.nextInt();
	int secondNum = keyboardInput.nextInt();
	int thirdNum = keyboardInput.nextInt();
	int fourthNum = keyboardInput.nextInt();

	int even =  0;
	int odd = 0;

	if (firstNum % 2 == 0) {
	even = even + firstNum;
	}

	if (firstNum % 2 != 0) {
	odd = odd + firstNum;
	}

	if (secondNum % 2 == 0) {
	even = even + secondNum;
	}

	if (secondNum % 2 != 0) {
	odd = odd + secondNum;
	}

	if (thirdNum % 2 == 0) {
	even = even + thirdNum;
	}

	if (thirdNum % 2 != 0) {
	odd = odd + thirdNum;
	}

	if (fourthNum % 2 == 0) {
	even = even + fourthNum;
	}

	if (fourthNum % 2 != 0) {
	odd = odd + fourthNum;
	}

	System.out.print("Sum of Even numbers is: " + even);
	System.out.print("\nSum of Odd numbers is: " + odd);

	}
}