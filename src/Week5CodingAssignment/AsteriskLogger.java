/*two classes that implement the logger interface
 * this is asteriskLogger with log & error methods defined
*/

package Week5CodingAssignment;

public class AsteriskLogger implements Logger {
	
		public void log(String str) {
			System.out.println("***" + str + "***");
			}

		public void error(String str) {
			String error = "Error: " + str;
			System.out.println("****************");
			log(error);
			System.out.println("****************");
		}
	}
