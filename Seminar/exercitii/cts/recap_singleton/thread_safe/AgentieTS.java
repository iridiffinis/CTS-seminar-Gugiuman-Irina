package cts.recap_singleton.thread_safe;

public class AgentieTS {
	private String nume;
	private float capital;
	private int nrAngajati;
	
	private static AgentieTS instanta = null;

	private AgentieTS(String nume, float capital, int nrAngajati) {
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
	
	public static synchronized AgentieTS getInstance(String nume, float capital, int nrAngajati) {
		if(instanta == null)
		{
			instanta = new AgentieTS(nume, capital, nrAngajati);
		}
		return instanta;
	}
}
