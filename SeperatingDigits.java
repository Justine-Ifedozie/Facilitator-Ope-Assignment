import java.util.Scanner;
public class SeperatingDigits {
	public static void main(String[] args){
	Scanner keyboardInput = new Scanner(System.in);

	System.out.printf("Enter five number: ");
	int numEntered = keyboardInput.nextInt();

	int numOne = numEntered / 10000;

	int numTwo = numEntered % 10000;
	int numTwoNew = numTwo / 1000;

	int numThree = numTwo % 1000;
	int numThreeNew = numThree / 100;

	int numFour = numThree % 100;
	int numFourNew = numFour / 10;

	int numFive = numFour % 10;

	System.out.printf("%n   %d   %d   %d   %d   %d" , numOne, numTwoNew, numThreeNew, numFourNew, numFive);


	}
}