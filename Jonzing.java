import java.util.Scanner;
public class Jonzing{
 public static void main(String[] args){

Scanner keyboardInput = new Scanner(System.in);

System.out.printf("Enter a number: ");
int userNumber = keyboardInput.nextInt();
int squareOfUserNumber;

squareOfUserNumber = (userNumber * userNumber);

int hundred = 100;

if (userNumber > hundred) {
System.out.printf("The number you entered %d > %d%n", userNumber, hundred);
}

if (userNumber < hundred) {
System.out.printf("\nThe number you entered %d < %d%n", userNumber, hundred);
}

if (userNumber == hundred) {
System.out.printf("\nThe number you entered %d = %d%n", userNumber, hundred);
}

if (userNumber != hundred) {
System.out.printf("\nThe number you entered %d != %d%n", userNumber, hundred);
}

if (squareOfUserNumber > hundred) {
System.out.printf("The square of the number you entered is %d > %d", squareOfUserNumber, hundred);
}

if (squareOfUserNumber < hundred) {
System.out.printf("\nThe square of the number you entered is %d < %d", squareOfUserNumber, hundred);
}

if (squareOfUserNumber == hundred) {
System.out.printf("The square of the number you entered is %d = %d", squareOfUserNumber, hundred);
}

if (squareOfUserNumber != hundred) {
System.out.printf("\nThe square of the number you entered is %d != %d", squareOfUserNumber, hundred);
}


}
}
