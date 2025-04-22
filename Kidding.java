import java.util.Scanner;
public class Kidding{
public static void main(String[] args){
Scanner keyboardInput = new Scanner(System.in);

System.out.printf("Enter the First Number: ");
int firstNumber = keyboardInput.nextInt();

System.out.printf("Enter the Second Number: ");
int secondNumber = keyboardInput.nextInt();

System.out.printf("Enter the Third Number: ");
int thirdNumber = keyboardInput.nextInt();

int sumOfThreeNumbers = firstNumber + secondNumber + thirdNumber;
System.out.printf("%nThe Sum of the Three Numbers you entered is: %d%n", sumOfThreeNumbers);

int averageOfThreeNumbers = (firstNumber + secondNumber + thirdNumber) / 3;
System.out.printf("%nThe Average of the Three Numbers you entered is: %d%n", averageOfThreeNumbers);

int productOfThreeNumbers = (firstNumber * secondNumber * thirdNumber);
System.out.printf("%nThe Product of the Three Numbers you entered is: %d%n", productOfThreeNumbers);

//Method for determining the smallest number entered

	if (firstNumber < secondNumber && firstNumber < thirdNumber) {
	System.out.printf("%nThe First Number you entered: %d is the Smallest number%n", firstNumber);
	}

	if (secondNumber < firstNumber && secondNumber < thirdNumber) {
	System.out.printf("%nThe Second Number you entered: %d is the Smallest number%n", secondNumber);
	}

	if (thirdNumber < firstNumber && thirdNumber < secondNumber) {
	System.out.printf("%nThe Third Number you entered: %d is the Smallest number%n", thirdNumber);
	}

//Method for determining the biggest number entered

	if (firstNumber > secondNumber && firstNumber > thirdNumber) {
	System.out.printf("%nThe First Number you entered: %d is the Biggest number%n", firstNumber);
	}

	if (secondNumber > firstNumber && secondNumber > thirdNumber) {
	System.out.printf("%nThe Second Number you entered: %d is the Biggest number%n", secondNumber);
	}

	if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
	System.out.printf("%nThe Third Number you entered: %d is the Biggest number%n", thirdNumber);
	}



}
}