import java.util.Scanner;
public class Tripled {
	public static void main(String[] args){
	Scanner keyboardInput = new Scanner(System.in);

	System.out.println("Enter First Number: ");
	int firstNum = keyboardInput.nextInt();

	System.out.println("Enter Second Number: ");
	int secondNum = keyboardInput.nextInt();

int multipliedNum = firstNum * 3;

int doubledNum = secondNum  + secondNum;

int remainderNum = multipliedNum  %  doubledNum;

int dividedNum = multipliedNum  /  doubledNum;

if (remainderNum == 0) {
System.out.printf("The First Number you entered: %d when trippled %d is a multiple of the Second number you entered: %d when it is doubled %d because it can divide the number %d times without remainder", firstNum, multipliedNum, secondNum, doubledNum, dividedNum);
}

if (remainderNum != 0) {
System.out.printf("The First Number you entered: %d when trippled %d is not a multiple of the Second number you entered: %d when it is doubled %d because it cannot divide the number without remainder", firstNum, multipliedNum, secondNum, doubledNum);
}


	} 

}
