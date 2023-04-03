package cts.restaurant.simple_factory;

public class SupaVita implements Meniu{
	private int nrMasa;
	
	public SupaVita(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
	}

	@Override
	public void descriere() {
		System.out.println("Supa de vita la masa "+this.nrMasa);
		
	}
}
