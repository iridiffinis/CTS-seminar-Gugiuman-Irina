package cts.singleton;

public class Rector {
	private String nume;
	private int nrMandate;
	private int vasta;
	private static Rector instanta = null;
	
	public Rector(String nume, int numarMandate, int vasta) {
		super();
		this.nume = nume;
		this.nrMandate = numarMandate;
		this.vasta = vasta;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getNumarMandate() {
		return nrMandate;
	}
	public void setNumarMandate(int numarMandate) {
		this.nrMandate = numarMandate;
	}
	public int getVasta() {
		return vasta;
	}
	public void setVasta(int vasta) {
		this.vasta = vasta;
	}
	
	public static synchronized Rector getInstance(String nume,int nrMandate,int vasta)
	{
		if (instanta == null) {
			instanta = new Rector(nume, nrMandate, vasta);
		}
		return instanta;
	}
	@Override
	public String toString() {
		return "Rector [nume=" + nume + ", nrMandate=" + nrMandate + ", vasta=" + vasta + "]";
	}

}
