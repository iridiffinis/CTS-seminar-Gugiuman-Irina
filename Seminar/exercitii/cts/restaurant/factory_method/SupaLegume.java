package cts.restaurant.factory_method;

public class SupaLegume implements Meniu{

	private int nrMasa;
	
	public SupaLegume(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
	}


	@Override
	public void descriere() {
		System.out.println("Supa de lugume la masa nr."+this.nrMasa);
		
	}

}
