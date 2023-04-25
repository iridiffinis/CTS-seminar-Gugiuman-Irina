package cts.seminar.restaurant.decorator.clase;

public abstract class Decorator implements INotaDePlata{
	private INotaDePlata notaDePlata;

	public Decorator(INotaDePlata notaDePlata) {
		super();
		this.notaDePlata = notaDePlata;
	}
	
	public abstract void printeazaFelicitare();
	
	@Override
	public void printeazaNotaDePlata(double totalPlata) {
		this.notaDePlata.printeazaNotaDePlata(totalPlata);
		
	}
}
