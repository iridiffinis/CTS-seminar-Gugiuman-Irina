package cts.recap_singleton.inner_static_helper_class;

public class AgentieIC {
	private String nume;
	private float capital;
	private int nrAngajati;
	
	private static class AgentieHelper{
		private static final AgentieIC instanta = new AgentieIC();
	}
	
	public static AgentieIC getInstance(String nume, float capital, int nrAngajati) {
		return AgentieHelper.instanta;
	}
	
	private AgentieIC() {
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
	
	
}
