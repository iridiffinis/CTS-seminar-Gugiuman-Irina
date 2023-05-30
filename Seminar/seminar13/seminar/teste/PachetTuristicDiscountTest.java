package seminar.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import seminar.clase.IPersoana;
import seminar.clase.PachetTuristic;
import seminar.dubluri.StubPersoana;
import seminar.dubluri.StubPersoanaVarstnica;

public class PachetTuristicDiscountTest {
	@Tag("tag1")
	@Test
	void testAplicaDiscountPersoaneTinere() {
		IPersoana persoana = new StubPersoana();
		PachetTuristic pachet = new PachetTuristic(persoana, "Bucuresti", 10.0);
		
		pachet.aplicaDiscountVarstnici(20);
		assertEquals(10.0, pachet.getPret());
	}
	
	@Tag("tag2")
	@Test
	void testAplicaDiscountPersoaneVarstnice() {
		IPersoana persoana = new StubPersoanaVarstnica();
		PachetTuristic pachet = new PachetTuristic(persoana, "Bucuresti", 10.0);
		pachet.aplicaDiscountVarstnici(20);
		assertEquals(8.0, pachet.getPret());
	}

}
