import java.util.Scanner;
public class Divisiblee {
public static void main(String[] args) {
Scanner keyboardInput = new Scanner(System.in);

System.out.print("Enter an Integer: ");
int enteredNumber = keyboardInput.nextInt();

int divisibleNumber = enteredNumber % 3;

int dividedNumber = enteredNumber / 3;

int remainder = enteredNumber % 3;

if (divisibleNumber == 0) {
System.out.printf("The Integer you entered: %d is divisible by 3, the answer when divided by 3 is: %d", enteredNumber, dividedNumber);
}

if (divisibleNumber > 0) {
System.out.printf("The Integer you entered: %d is not divisible by 3, because it has a remainder of: %d when divided by 3", enteredNumber, remainder);
}


}
} 