package cts.spital.factory_method;

public class Anestezist implements PersonalSpital{
	private String nume;

	public Anestezist(String nume) {
		this.nume = nume;
	}

	@Override
	public void descriere() {
		System.out.println("Anestezit: "+this.nume);
		
	}
}
