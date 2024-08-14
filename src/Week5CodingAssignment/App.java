/*new class called App
 * instantiated asterisk & spaced classes together
 * with strings of my own choosing
*/

package Week5CodingAssignment;

public class App {

	public static void main(String[] args) {

		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("Hello there!");
		asteriskLogger.error("Goodbye now!");
		
		System.out.println();
		
		spacedLogger.log("Instance initiated...");
		spacedLogger.error("Instance terminated!");

	}

}
