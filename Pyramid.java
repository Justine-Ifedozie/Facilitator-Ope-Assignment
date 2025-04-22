public class Pyramid {
	public static void main(String[] args) {

	double  estNumStones = 2.3; 
	//2,300,000 Stones, I converted it to decimal by dividing it by 1,000,000
	
	double avgWeightEachStones = 2.5; 
	//unit is tons (2.5tons)

	double yearsBuilt = 0.26; 
	//It took 26 years to build the Pyramid, I converted to to a decimal number
 
	double pyramidWeight = estNumStones * avgWeightEachStones;


	double weightBuiltPerYear = yearsBuilt / pyramidWeight;
	System.out.println("Estimated weight of the Giza pyramid built each year is:" + weightBuiltPerYear * 1000000);


	}

}