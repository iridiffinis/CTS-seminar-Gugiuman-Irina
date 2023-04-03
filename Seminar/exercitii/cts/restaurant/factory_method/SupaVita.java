package cts.restaurant.factory_method;

public class SupaVita implements Meniu{
	private int nrMasa;
	
	public SupaVita(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
	}
	@Override
	public void descriere() {
		System.out.println("Supa de vita la masa nr."+this.nrMasa);
		
	}

}
