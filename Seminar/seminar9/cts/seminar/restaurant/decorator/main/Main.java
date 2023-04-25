package cts.seminar.restaurant.decorator.main;

import cts.seminar.restaurant.decorator.clase.Decorator;
import cts.seminar.restaurant.decorator.clase.DecoratorNotaDePlataLaMultiAni;
import cts.seminar.restaurant.decorator.clase.DecoratorNotaDePlataPasteFericit;
import cts.seminar.restaurant.decorator.clase.INotaDePlata;
import cts.seminar.restaurant.decorator.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		INotaDePlata notaDePlata1 = new NotaDePlata("2023-04-25");
		INotaDePlata notaDePlata2 = new NotaDePlata("2023-04-26");
		
		notaDePlata1.printeazaNotaDePlata(250);
		notaDePlata2.printeazaNotaDePlata(400);
		System.out.println();
		
		Decorator notaDePlataPaste = new DecoratorNotaDePlataPasteFericit(notaDePlata1);
		notaDePlataPaste.printeazaNotaDePlata(400);
		notaDePlataPaste.printeazaFelicitare();
		System.out.println();
		
		Decorator notaDePlataLaMultiAni = new DecoratorNotaDePlataLaMultiAni(notaDePlataPaste);
		notaDePlataLaMultiAni.printeazaNotaDePlata(250);
		notaDePlataLaMultiAni.printeazaFelicitare();
		System.out.println();
		
		

	}

}
