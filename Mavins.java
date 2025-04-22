import java.util.Scanner;
public class Mavins {
 public static void main(String[] args) {

 Scanner keyboardInput = new Scanner(System.in);

System.out.printf("Enter First Number: ");
int firstNumber = keyboardInput.nextInt();

System.out.printf("Enter Second Number: ");
int secondNumber = keyboardInput.nextInt();

System.out.printf("Enter Third Number: ");
int thirdNumber = keyboardInput.nextInt();

int sum = firstNumber + secondNumber + thirdNumber;
System.out.printf("\nThe sum of the three numbers you entered is: %d\n", sum);
 
int multipliedResult = firstNumber * secondNumber * thirdNumber;
System.out.printf("\nThe multiplication of the three numbers you entered is: %d\n", multipliedResult);

   if (firstNumber > secondNumber) {
   System.out.printf("\nThe First Number you entered: %d is the biggest number\n", firstNumber);
     if (firstNumber > thirdNumber);
   }

   if (secondNumber > thirdNumber) {
   System.out.printf("\nThe Second Number you entered: %d is the biggest number\n", secondNumber);
     if (firstNumber < secondNumber);
   }


   if (secondNumber > firstNumber) {
   System.out.printf("\nThe Second Number you entered: %d is the biggest number\n", secondNumber);
     if (firstNumber < secondNumber);
   }


   if (thirdNumber > secondNumber) {
   System.out.printf("\nThe Third Number you entered: %d is the biggest number\n", thirdNumber);
     if (thirdNumber > firstNumber);
   }

     if (firstNumber < secondNumber) {
     System.out.printf("\nThe First Number you entered: %d is the smallest number\n", firstNumber);
       if (secondNumber < thirdNumber);
     }


}
}