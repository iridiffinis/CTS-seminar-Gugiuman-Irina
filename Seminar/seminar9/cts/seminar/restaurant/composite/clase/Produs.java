package cts.seminar.restaurant.composite.clase;

public class Produs implements Item{
	private String nume;
	
	public Produs(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void adaugareItem(Item item) throws Exception {
		throw new Exception("adaugareItem nu este implementat");
		
	}

	@Override
	public void stergereItem(Item item) throws Exception {
		throw new Exception("stergereItem nu este implementat");
		
	}

	@Override
	public void descriere(String indentare) {
		// TODO Auto-generated method stub
		System.out.println(indentare+this.nume);
	}

	@Override
	public Item getItem(int index) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("getItem nu este implementat");
	}

}
