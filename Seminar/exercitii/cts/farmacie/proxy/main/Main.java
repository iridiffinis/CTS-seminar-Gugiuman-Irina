package cts.farmacie.proxy.main;

import cts.farmacie.proxy.clase.Farmacie;
import cts.farmacie.proxy.clase.IFarmacie;
import cts.farmacie.proxy.clase.ProxyFarmacie;

public class Main {
	public static void main(String[] args) {
		IFarmacie farmacie = new Farmacie("Sensyblue");
		farmacie.vanzareMedicamente(true);
		farmacie.vanzareMedicamente(false);
		System.out.println();
		
		IFarmacie proxy = new ProxyFarmacie(farmacie);
		proxy.vanzareMedicamente(false);
		proxy.vanzareMedicamente(true);
	}
}
