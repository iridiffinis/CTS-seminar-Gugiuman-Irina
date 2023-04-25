package cts.seminar.restaurant.decorator.clase;

public class DecoratorNotaDePlataPasteFericit extends Decorator{

	public DecoratorNotaDePlataPasteFericit(INotaDePlata notaDePlata) {
		super(notaDePlata);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printeazaNotaDePlata(double totalPlata) {
		// TODO Auto-generated method stub
		super.printeazaNotaDePlata(totalPlata);
		System.out.println("Paste Fericit!");
	}

	@Override
	public void printeazaFelicitare() {
		// TODO Auto-generated method stub
		System.out.println("Paste Fericit!");
	}

}
