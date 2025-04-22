import java.util.Scanner;
public class FutureInvestment {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	
	System.out.print("Enter an Investment amount: ");
	double investAmount = keyboardInput.nextDouble();

	System.out.print("Enter annual interest: ");
	double annualInterestRate = keyboardInput.nextDouble();

	System.out.print("Enter number of years: ");
	double numberOfYears = keyboardInput.nextDouble();

	double monthlyInterestRate = annualInterestRate / 100 / 12;

	double futureInvestmentValue = investAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));

	System.out.printf("Accumulated value: %f", futureInvestmentValue);

	}
}