package cts.farmacie.factory_method;

public class MDurere implements Medicament{
	private String denumire;
	private float pret;
	
	public MDurere(String denumire, float pret) {
		super();
		this.denumire = denumire;
		this.pret = pret;
	}

	@Override
	public void descriere() {
		System.out.println("Medicament pentru durere: "+this.denumire+", pret "+this.pret);
		
	}

}
