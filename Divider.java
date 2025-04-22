import java.util.Scanner;
public class Divider { 
public static void main(String[] args) {

Scanner userInput = new Scanner(System.in);

System.out.print("Enter a number: ");
int userInteger = userInput.nextInt();

int divisionOfUserNumber = userInteger / 3;

int divisionOfRemainder = userInteger % 3;

if (divisionOfRemainder == 0) {
System.out.printf("The number you entered is divisible by 3" );
}

if (divisionOfRemainder != 0) {
System.out.printf("The number you entered is: %d and is not divisible by 3 because it has a remainder of %d", userInteger, divisionOfRemainder);
}


}
}