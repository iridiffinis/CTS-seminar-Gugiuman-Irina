package cts.recap_singleton.static_block;

public class AgentieSB {
	private String nume;
	private float capital;
	private int nrAngajati;
	
	private static AgentieSB instanta;
	
	static {
		try {
			instanta = new AgentieSB();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	private AgentieSB() {
		this.nume="AgeTur";
		this.capital = 1000;
		this.nrAngajati=5;
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
	
	public static AgentieSB getInstance(String nume, float capital, int nrAngajati) {
		return instanta;
	}
}
