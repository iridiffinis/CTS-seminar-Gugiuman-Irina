package cts.farmacie.composite.clase;

public class Medicament implements Item{
	private String nume;

	public Medicament(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void adaugareItem(Item item) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("adaugareItem neimplementat");
	}

	@Override
	public void stergereItem(Item item) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("stergere Item neimplementat");
	}

	@Override
	public void descriere(String indentare) {
		// TODO Auto-generated method stub
		System.out.println(indentare+this.nume);
	}

	@Override
	public Item getItem(int index) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("getItem neimplementat");
	}
	
}
