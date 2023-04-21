package cts.farmacie.factory_method;

public class MBody implements Medicament{
	private String denumire;
	private float pret;
	
	public MBody(String denumire, float pret) {
		super();
		this.denumire = denumire;
		this.pret = pret;
	}

	@Override
	public void descriere() {
		System.out.println("Medicament pentru body: "+this.denumire+", pret "+this.pret);
		
	}

}
