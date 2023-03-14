package cts.singleton;

public class Decan {
	private String nume;
	private static final Decan instanta =new Decan("Ion");
	public Decan(String nume) {
		super();
		this.nume = nume;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public static Decan getInstanta() {
		return instanta;
	}
	public static Decan getInstance()
	{
		return instanta;
	}
	
}
