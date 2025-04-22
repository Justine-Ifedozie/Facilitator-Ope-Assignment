public class Tyramid {
	public static void main(String[] args) {

	int  estNumStones = 2300000; 
	//2,300,000 Stones was used, I reduced the stones estimated number because I increased the weight
	
	double avgWeightEachStones = 2.5; 
	//2.5tons - 15tons of stone weight was used, I chose 3tons as my average stone weight

	int yearsBuilt = 26; 
 
	double pyramidWeight = estNumStones * avgWeightEachStones;

	double weightBuiltPerYear = pyramidWeight / yearsBuilt;
	System.out.println("Estimated weight of the Giza pyramid built each year is:" + weightBuiltPerYear + "tons");

	double weightPerDayBuilt = weightBuiltPerYear / 365;

	double weightPerHour = weightPerDayBuilt / 24;

	double weightPerMinutes = weightPerHour / 60;

	System.out.println("Estimated weight of the Giza pyramid built each hour is:" + weightPerHour + "tons");

	System.out.println("Estimated weight of the Giza pyramid built each minutes is:" + weightPerMinutes  + "tons");

	}

}