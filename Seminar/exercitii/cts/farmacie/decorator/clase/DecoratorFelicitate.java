package cts.farmacie.decorator.clase;

public class DecoratorFelicitate extends Decorator{

	public DecoratorFelicitate(IBonDeCasa bonDeCasa) {
		super(bonDeCasa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printareFelicitare() {
		// TODO Auto-generated method stub
		System.out.println("La multi ani!");
	}

	@Override
	public void printareBon(double totalPlata) {
		// TODO Auto-generated method stub
		super.printareBon(totalPlata);
		printareFelicitare();
	}
	

}
