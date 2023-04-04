package cts.recap_singleton.eager_initialization;

public class AgentieEI {
	private String nume;
	private float capital;
	private int nrAngajati;
	
	private static final AgentieEI instanta = new AgentieEI();

	private AgentieEI() {
		super();
		this.nume = "AgeTur";
		this.capital = 1000;
		this.nrAngajati = 5;
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
	
	public static AgentieEI getInstance(String nume, float capital, int nrAngajati) {
		return instanta;
	}
}
