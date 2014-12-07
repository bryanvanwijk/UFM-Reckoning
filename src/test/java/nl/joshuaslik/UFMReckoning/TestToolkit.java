package nl.joshuaslik.UFMReckoning;

/**
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class TestToolkit {

	public static void printName() {
		System.out.println("\n\\\\" + Thread.currentThread().getStackTrace()[2]
				.getMethodName());
	}

}
