import java.util.Scanner;
public class DistancePoints {
	public static void main (String[] args) {
	Scanner keyboardInput = new Scanner(System.in);

	System.out.print("Enter two points first: ");
	double x1 = keyboardInput.nextDouble();
	double y1 = keyboardInput.nextDouble();

	System.out.print("Enter two points second: ");
	double x2 = keyboardInput.nextDouble();
	double y2 = keyboardInput.nextDouble();

	double pointsX = (x2 - x1) * (x2 - x1);
	double pointsY = (y2 - y1) * (y2 - y1);

	double pointsXy = pointsX + pointsY;
	double pointsXySquareRoot = Math.sqrt(pointsXy);

	System.out.println(pointsXySquareRoot);

	System.out.println(Math.sqrt(pointsXy));

	}
}