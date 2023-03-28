package cts.prototype;

public class Persoana implements PrototypePersoana{
	
	private double dimCap;
	private double dimGat;
	private double dimUmeri;
	
	public Persoana() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persoana(double dimCap, double dimGat, double dimUmeri) {
		super();
		this.dimCap = dimCap;
		this.dimGat = dimGat;
		this.dimUmeri = dimUmeri;
	}


	public void setDimCap(double dimCap) {
		this.dimCap = dimCap;
	}

	public void setDimGat(double dimGat) {
		this.dimGat = dimGat;
	}

	public void setDimUmeri(double dimUmeri) {
		this.dimUmeri = dimUmeri;
	}

	@Override
	public String toString() {
		return "Persoana [dimCap=" + dimCap + ", dimGat=" + dimGat + ", dimUmeri=" + dimUmeri + "]";
	}

	@Override
	public PrototypePersoana copiaza() {
		Persoana persoana = new Persoana();
		persoana.dimCap = this.dimCap;
		persoana.dimGat = this.dimGat;
		persoana.dimUmeri = this.dimUmeri;
		return persoana;
	}

	
}
