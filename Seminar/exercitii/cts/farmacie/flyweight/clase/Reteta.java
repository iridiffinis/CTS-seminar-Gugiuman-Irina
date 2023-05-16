package cts.farmacie.flyweight.clase;

public class Reteta {
	private int nrReteta;
	private double sumaPlata;
	private int nrMedicamente;
	
	public Reteta(int nrReteta, double sumaPlata, int nrMedicamente) {
		super();
		this.nrReteta = nrReteta;
		this.sumaPlata = sumaPlata;
		this.nrMedicamente = nrMedicamente;
	}

	public int getNrReteta() {
		return nrReteta;
	}

	public void setNrReteta(int nrReteta) {
		this.nrReteta = nrReteta;
	}

	public double getSumaPlata() {
		return sumaPlata;
	}

	public void setSumaPlata(double sumaPlata) {
		this.sumaPlata = sumaPlata;
	}

	public int getNrMedicamente() {
		return nrMedicamente;
	}

	public void setNrMedicamente(int nrMedicamente) {
		this.nrMedicamente = nrMedicamente;
	}

	@Override
	public String toString() {
		return "Reteta [nrReteta=" + nrReteta + ", sumaPlata=" + sumaPlata + ", nrMedicamente=" + nrMedicamente + "]";
	}
	
}
