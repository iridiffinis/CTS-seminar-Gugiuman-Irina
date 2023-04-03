package cts.restaurant.simple_factory;

public class SupaLegume implements Meniu{
	private int nrMasa;
	
	public SupaLegume(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
	}

	@Override
	public void descriere() {
		System.out.println("Supa de legume la masa "+this.nrMasa);
		
	}

}
