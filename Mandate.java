import java.util.Scanner;
public class Mandate{
public static void main(String[] args){
Scanner keyboardInput = new Scanner(System.in);

System.out.print("Enter first number: ");
int integerOne = keyboardInput.nextInt();

System.out.print("Enter second number: ");
int integerTwo = keyboardInput.nextInt();

int squareOfIntegerOne = (integerOne * integerOne);
 int squareOfIntegerTwo = (integerTwo * integerTwo);
  System.out.print("\nThe square of the first number you entered is: " + squareOfIntegerOne + " \nThe square of the second number you entered is: " + squareOfIntegerTwo);

int sumOfSquares = (squareOfIntegerOne + squareOfIntegerTwo);
 System.out.print("\nSum of both squares is: " + sumOfSquares);

int differenceOfTheSquares = (squareOfIntegerOne - squareOfIntegerTwo);
System.out.print("\nDifference between Square of the first number from the square of the second number is: " + differenceOfTheSquares);

}
}