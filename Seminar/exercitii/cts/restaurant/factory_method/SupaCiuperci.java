package cts.restaurant.factory_method;

public class SupaCiuperci implements Meniu{
	private int nrMasa;
		
	public SupaCiuperci(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
	}


	@Override
	public void descriere() {
		System.out.println("Supa de ciuperci la masa nr."+this.nrMasa);
		
	}

}
