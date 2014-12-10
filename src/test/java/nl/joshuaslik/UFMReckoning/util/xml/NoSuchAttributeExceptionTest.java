package nl.joshuaslik.UFMReckoning.util.xml;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author <a href="http://www.joshuaslik.nl/" target="_blank">Joshua Slik</a>
 *
 */
public class NoSuchAttributeExceptionTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testThrows() {
		thrown.expect(NoSuchAttributeException.class);
		throw new NoSuchAttributeException();
	}

	@Test
	public void testThrowMessage() {
		thrown.expect(NoSuchAttributeException.class);
		thrown.expectMessage("A message");
		throw new NoSuchAttributeException("A message");
	}

}