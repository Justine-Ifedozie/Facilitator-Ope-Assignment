import java.util.Scanner;
public class Largesly{
 public static void main(String[] args){

 Scanner keyboardInput = new Scanner(System.in);

 System.out.printf("Enter the First Integer: ");
 int firstInteger = keyboardInput.nextInt();

 System.out.printf("Enter the Second Integer: ");
 int secondInteger = keyboardInput.nextInt();

 System.out.printf("Enter the Third Integer: ");
 int thirdInteger = keyboardInput.nextInt();

 System.out.printf("Enter the Fourth Integer: ");
 int fourthInteger = keyboardInput.nextInt();

 System.out.printf("Enter the Fifth Integer: ");
 int fifthInteger = keyboardInput.nextInt();


//This is the method for printing the largest integers

	if (firstInteger > secondInteger && firstInteger > thirdInteger && firstInteger > fourthInteger && firstInteger > fifthInteger) {
	System.out.printf("The First Number you entered: %d is the largest Number%n", firstInteger);
	}

	if (secondInteger > firstInteger && secondInteger > thirdInteger && secondInteger > fourthInteger && secondInteger > fifthInteger) {
	System.out.printf("The Second Number you entered: %d is the largest Number%n", secondInteger);
	}

	if (thirdInteger > firstInteger && thirdInteger > secondInteger && thirdInteger > fourthInteger && thirdInteger > fifthInteger) {
	System.out.printf("The Third Number you entered: %d is the largest Number%n", thirdInteger);
	}

	if (fourthInteger > firstInteger && fourthInteger > secondInteger && fourthInteger > thirdInteger && fourthInteger > fifthInteger) {
	System.out.printf("The Fourth Number you entered: %d is the largest Number%n", fourthInteger);
	}

	if (fifthInteger > firstInteger && fifthInteger > secondInteger && fifthInteger > thirdInteger && fifthInteger > fourthInteger) {
	System.out.printf("The FifthInteger Number you entered: %d is the largest Number%n", fifthInteger);
	}

//This is the method for printing the smallest integers

	if (firstInteger < secondInteger && firstInteger < thirdInteger && firstInteger < fourthInteger && firstInteger < fifthInteger) {
	System.out.printf("The First Number you entered: %d is the smallest Number%n", firstInteger);
	}

	if (secondInteger < firstInteger && secondInteger < thirdInteger && secondInteger < fourthInteger && secondInteger < fifthInteger) {
	System.out.printf("The Second Number you entered: %d is the smallest Number%n", secondInteger);
	}

	if (thirdInteger < firstInteger && thirdInteger < secondInteger && thirdInteger < fourthInteger && thirdInteger < fifthInteger) {
	System.out.printf("The Third Number you entered: %d is the smallest Number%n", thirdInteger);
	}

	if (fourthInteger < firstInteger && fourthInteger < secondInteger && fourthInteger < fifthInteger && fourthInteger < fifthInteger) {
	System.out.printf("The Fourth Number you entered: %d is the smallest Number%n", fourthInteger);
	}

	if (fifthInteger < firstInteger && fifthInteger < secondInteger && fifthInteger < thirdInteger && fifthInteger < fourthInteger) {
	System.out.printf("The Fourth Number you entered: %d is the smallest Number%n", fourthInteger);
	}

}
}
