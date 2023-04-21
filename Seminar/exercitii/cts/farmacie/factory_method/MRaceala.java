package cts.farmacie.factory_method;

public class MRaceala implements Medicament{
	private String denumire;
	private float pret;
	
	public MRaceala(String denumire, float pret) {
		super();
		this.denumire = denumire;
		this.pret = pret;
	}

	@Override
	public void descriere() {
		System.out.println("Medicament pentru raceala: "+this.denumire+", pret "+this.pret);
		
	}
	
	
}
