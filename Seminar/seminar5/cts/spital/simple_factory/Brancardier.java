package cts.spital.simple_factory;

public class Brancardier implements PersonalSpital{
	private String nume;

	public Brancardier(String nume) {
		this.nume = nume;
	}

	@Override
	public void descriere() {
		System.out.println("Brancardierul "+this.nume);
		
	}
}
