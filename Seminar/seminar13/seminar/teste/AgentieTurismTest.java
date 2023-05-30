package seminar.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import seminar.clase.AgentieTurism;
import seminar.clase.IPachetTuristic;
import seminar.dubluri.FakePachetTuristic;

public class AgentieTurismTest {
	@Tag("tag1")
	@Test
	void testCalculareSumaTotalaPachete() {
		AgentieTurism agentieTurism = new AgentieTurism();
		IPachetTuristic pachet1 = new FakePachetTuristic();
		IPachetTuristic pachet2 = new FakePachetTuristic();
		IPachetTuristic pachet3 = new FakePachetTuristic();
		pachet1.setPret(200.0);
		pachet2.setPret(300.0);
		pachet3.setPret(400.0);
		agentieTurism.adaugaPachet(pachet1);
		agentieTurism.adaugaPachet(pachet2);
		agentieTurism.adaugaPachet(pachet3);
		
		assertEquals(900.0, agentieTurism.calculareSumaTotalaPachete());
	}

}
