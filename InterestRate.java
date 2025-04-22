import java.util.Scanner;
public class InterestRate {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter the balance: ");
	double balance = keyboardInput.nextDouble();

	System.out.print("Enter the annual percentage interes rate: ");
	double annualInterest = keyboardInput.nextDouble();

	double interest = balance * (annualInterest / 1200);

	System.out.printf("The interest is: %.5f", interest);

	}
}