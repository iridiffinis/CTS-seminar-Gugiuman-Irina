package cts.farmacie.decorator.main;

import cts.farmacie.decorator.clase.BonDeCasa;
import cts.farmacie.decorator.clase.Decorator;
import cts.farmacie.decorator.clase.DecoratorFelicitate;
import cts.farmacie.decorator.clase.IBonDeCasa;

public class Main {
	public static void main(String[] args) {
		IBonDeCasa bon1 = new BonDeCasa("12-02-2023");
		IBonDeCasa bon2 = new BonDeCasa("15-02-2023");
		IBonDeCasa bon3 = new BonDeCasa("22-03-2023");
		bon1.printareBon(12.66);
		bon2.printareBon(57.45);
		bon3.printareBon(152.36);
		System.out.println();
		
		Decorator decoratorFelicitare = new DecoratorFelicitate(bon1);
		decoratorFelicitare.printareBon(65.55);
		decoratorFelicitare.printareFelicitare();
	}
}
