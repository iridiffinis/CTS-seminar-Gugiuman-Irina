package seminar.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import seminar.clase.MyException;
import seminar.clase.Persoana;

public class PersoanaGetVarstaTeste {

	@Test
	public void testGetVarsta() {
		Persoana p = new Persoana("Tiberiu","5020118340456");
		assertEquals(21, p.getVarsta());
	}
	
	@Test
	public void testGetVarstaBoundaryNouNascut() {
		Persoana p = new Persoana("Tiberiu","5230520340456");
		assertEquals(0, p.getVarsta());
	}
	
	@Test
	public void testGetVarstaBoundaryAnul2000() {
		Persoana p = new Persoana("Tiberiu","5000101340456");
		assertEquals(23, p.getVarsta());
	}
	
	@Test
	public void testGetVarstaBoundaryAnul1900() {
		Persoana p = new Persoana("Tiberiu","1000101340456");
		assertEquals(123, p.getVarsta());
	}
	
	@Test
	public void testGetVarstaBoundaryAnul1999() {
		Persoana p = new Persoana("Tiberiu","1991231340456");
		assertEquals(23, p.getVarsta());
	}
	
	@Test(expected = MyException.class)
	public void testGetVarstaException() {
		Persoana p = new Persoana("Tiberiu","5230525340456");
		p.getVarsta();
	}
	
	@Test(timeout = 100)
	public void testGetVarstaPerformance() {
		Persoana p = new Persoana("Tiberiu","5020118340456");
		p.getVarsta();
	}

}
