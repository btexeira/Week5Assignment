/*two classes that implement the logger interface
 * this is spacedlogger with log & error methods defined
*/

package Week5CodingAssignment;

public class SpacedLogger implements Logger {
	
	public void log(String str) {
		StringBuilder log = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			log.append(str.charAt(i)).append(" ");
		}
		System.out.println(log);
		}

	public void error(String str) {
		String er = ("ERROR: " + str);
		log(er);
	}
}
