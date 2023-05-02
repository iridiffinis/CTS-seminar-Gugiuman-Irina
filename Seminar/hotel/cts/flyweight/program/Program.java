package cts.flyweight.program;

import cts.flyweight.clase.FabricaDeCamere;
import cts.flyweight.clase.ICamera;
import cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervarePopescu = new Rezervare("Popescu", 3);
		Rezervare rezervareIonescu = new Rezervare("Ionescu",6);
		Rezervare rezervareVasilescu = new Rezervare("Vasilescu", 2);
		
		FabricaDeCamere fabrica = new FabricaDeCamere();
		
		ICamera camera2 = fabrica.getCamera(1);
		camera2.tiparire(rezervareVasilescu);
		fabrica.getCamera(1).tiparire(rezervareIonescu);
		fabrica.getCamera(2).tiparire(rezervarePopescu);

	}

}
