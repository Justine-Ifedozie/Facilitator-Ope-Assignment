public class worldPopulation {
	public static void main(String[] args) {

	double worldPop = 8.2; //I divided 8.2billion by 1billion to change the population to a decimal number.

	double growthRateFirstYear = (0.85 / 100);
	double growthRateSecondYear = 2 * (0.85 / 100);
	double growthRateThirdYear = 3 * (0.85 / 100);
	double growthRateFourthYear = 4 * (0.85 / 100);
	double growthRateFifthYear = 5 * (0.85 / 100);

	System.out.printf("The World Population after One Year is: %.2f billion people%n" , worldPop * (1 + growthRateFirstYear * 1));

	System.out.printf("The World Population after Two Years is: %.2f billion people%n", worldPop * (1 + growthRateSecondYear * 1));

	System.out.printf("The World Population after Three Years is: %.2f billion people%n", worldPop * (1 + growthRateThirdYear * 1));

	System.out.printf("The World Population after Four Years is: %.2f billion people%n", worldPop * (1 + growthRateFourthYear * 1));

	System.out.printf("The World Population after Five Years is: %.2f billion people%n", worldPop * (1 + growthRateFifthYear * 1));


	}
}