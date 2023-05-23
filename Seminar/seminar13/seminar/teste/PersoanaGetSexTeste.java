package seminar.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import seminar.clase.MyException;
import seminar.clase.Persoana;

public class PersoanaGetSexTeste {

	@Test
	public void testGetRightSexMasculin() {
		Persoana p = new Persoana("Tiberiu","5020118340456");
		assertEquals("M",p.getSex());
	}
	
	@Test
	public void testGetRightSexFeminin() {
		Persoana p2 = new Persoana("Maria","6020118340456");
		assertEquals("F",p2.getSex());
	}

	@Test
	public void testGetBoundarySexMasculin() {
		Persoana p = new Persoana("Tiberiu","1020118340456");
		assertEquals("M",p.getSex());

	}
	
	@Test
	public void testGetCrossCheckSex() {
		Persoana p = new Persoana("Tiberiu","1020118340456");
		assertEquals(verificareParitate(p.CNP),p.getSex());

	}
	
	public String verificareParitate(String cnp)
	{
		int n = Integer.parseInt(cnp.charAt(0)+"");
		if(n%2!=0)
			return "M";
		return "F";
	}
	
	@Test(expected = MyException.class)
	public void testGetSexError() {
		Persoana p = new Persoana("Tiberiu","9020118340456");
		p.getSex();
	}
	
	@Test(timeout = 100)
	public void testGetSexPerformance() {
		Persoana p = new Persoana("Tiberiu","5020118340456");
		p.getSex();
	}
	
	

}
