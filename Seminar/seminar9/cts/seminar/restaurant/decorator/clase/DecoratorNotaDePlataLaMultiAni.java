package cts.seminar.restaurant.decorator.clase;

public class DecoratorNotaDePlataLaMultiAni extends Decorator{

	public DecoratorNotaDePlataLaMultiAni(INotaDePlata notaDePlata) {
		super(notaDePlata);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printeazaNotaDePlata(double totalPlata) {
		// TODO Auto-generated method stub
		super.printeazaNotaDePlata(totalPlata);
		System.out.println("La multi ani!");
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("La multi ani");
		
	}

}
