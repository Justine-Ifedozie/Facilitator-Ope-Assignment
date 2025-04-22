public class TestFile {
	public static void main(String[] args) {

	long totalMilliSecond = System.currentTimeMillis();

	long totalSeconds = totalMilliSecond / 1000;

	long currentSeconds = totalSeconds % 60;
	
	long totalMinutes = totalSeconds / 60;

	long currentMinutes = totalMinutes % 60;

	long totalHours = totalMinutes / 60;

	long currentHour = totalHours % 60;

	System.out.print(currentHour + ":");
	System.out.print(currentMinutes + ":" );
	System.out.print(currentSeconds);


	}
}