package cts.restaurant.simple_factory;

public class SupaCiuperci implements Meniu{
	private int nrMasa;
	
	public SupaCiuperci(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
	}

	@Override
	public void descriere() {
		System.out.println("Supa de ciuperci la masa "+this.nrMasa);
		
	}
}
