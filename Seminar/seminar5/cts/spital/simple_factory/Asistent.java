package cts.spital.simple_factory;

public class Asistent implements PersonalSpital{
	private String nume;

	public Asistent(String nume) {
		this.nume = nume;
	}

	@Override
	public void descriere() {
		System.out.println("Asistentul "+this.nume);
		
	}
}
