package seminar.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import seminar.clase.IPersoana;
import seminar.clase.PachetTuristic;
import seminar.dubluri.FakePersoana;

public class PachetTuristicVarstaTest {
	@Tag("tag2")
	@Test
	void testTanarNuPoateRezerva() {
		FakePersoana persoana = new FakePersoana();
		persoana.setVarsta(16);
		PachetTuristic pachet = new PachetTuristic(persoana, "Cluj", 200.0);
		
		assertFalse(pachet.poateRezerva());
	}

	@Test
	void testAdultPoateRezerva() {
		FakePersoana persoana = new FakePersoana();
		persoana.setVarsta(41);
		PachetTuristic pachet = new PachetTuristic(persoana, "Cluj", 200.0);
		
		assertTrue(pachet.poateRezerva());
	}
}
