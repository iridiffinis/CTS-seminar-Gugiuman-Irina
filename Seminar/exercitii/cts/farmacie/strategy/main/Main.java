package cts.farmacie.strategy.main;

import cts.farmacie.strategy.clase.Client;
import cts.farmacie.strategy.clase.PlataCard;
import cts.farmacie.strategy.clase.PlataCash;

public class Main {
	public static void main(String[] args) {
		Client client = new Client("Mircea");
		client.realizeazaPlata(24.12);
		client.setModPlata(new PlataCard());
		client.realizeazaPlata(85.36);
		client.setModPlata(new PlataCash());
		client.realizeazaPlata(32.55);
	}
}
