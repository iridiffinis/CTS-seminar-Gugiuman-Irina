package cts.recap_singleton.lazy_initialization;

public class AgentieLI {
	private String nume;
	private float capital;
	private int nrAngajati;
	
	private static AgentieLI instanta = null;

	private AgentieLI(String nume, float capital, int nrAngajati) {
		super();
		this.nume = nume;
		this.capital = capital;
		this.nrAngajati = nrAngajati;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public float getCapital() {
		return capital;
	}

	public void setCapital(float capital) {
		this.capital = capital;
	}

	public int getNrAngajati() {
		return nrAngajati;
	}

	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}
	
	public static AgentieLI getInstance(String nume, float capital, int nrAngajati) {
		if(instanta == null)
		{
			instanta = new AgentieLI(nume, capital, nrAngajati);
		}
		return instanta;
	}

	@Override
	public String toString() {
		return "AgentieLI [nume=" + nume + ", capital=" + capital + ", nrAngajati=" + nrAngajati + "]";
	}
	
}
