public class MethodLearning {
	public static void main (String[] args) {

	String phoneMenu = menu();
	System.out.print(phoneMenu);

	}

	public static String menu () {
		String nokiamenu = """

		List of menu functions 

		Press: 
		1. Phone book
		2. Messages
		3. Chat
		4. Call register
		5. Tones
		6. Settings
		7. Call divert
		8. Games
		9. Calculator
		10. Reminders
		11. Clock
		12. Profiles
		13. SIM services
		""";
		return nokiamenu;

}



}




