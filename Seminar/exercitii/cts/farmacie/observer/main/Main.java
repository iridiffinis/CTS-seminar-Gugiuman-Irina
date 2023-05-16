package cts.farmacie.observer.main;

import cts.farmacie.observer.clase.ClientFarmacie;
import cts.farmacie.observer.clase.Farmacie;
import cts.farmacie.observer.clase.Observer;

public class Main {
	public static void main(String[] args) {
		Farmacie farmacie = new Farmacie("Tei");
		
		Observer client1 = new ClientFarmacie("Carmen");
		Observer client2 = new ClientFarmacie("Marcela");
		Observer client3 = new ClientFarmacie("Angela");
		
		farmacie.adaugareObserver(client1);
		farmacie.adaugareObserver(client2);
		farmacie.notificareOfertePret();
		farmacie.adaugareObserver(client3);
		farmacie.notificareAbonati("S-a epuizat stocul de medicamente pentru tuse");
		farmacie.stergereObserver(client1);
		farmacie.notificareOfertePret();
	}
}
