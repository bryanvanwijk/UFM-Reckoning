package nl.joshuaslik.UFMReckoning.backend;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class SaveTest {
	@Test
	public void testSave() throws IOException {
		System.out.println(Save.loadplayers().get(63).getID());
		Save.loadTeam();
	}
}
