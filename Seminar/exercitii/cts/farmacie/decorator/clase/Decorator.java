package cts.farmacie.decorator.clase;

public abstract class Decorator implements IBonDeCasa{
	private IBonDeCasa bonDeCasa;

	public Decorator(IBonDeCasa bonDeCasa) {
		super();
		this.bonDeCasa = bonDeCasa;
	}

	@Override
	public void printareBon(double totalPlata) {
		// TODO Auto-generated method stub
		this.bonDeCasa.printareBon(totalPlata);
	}
	
	public abstract void printareFelicitare();
}
