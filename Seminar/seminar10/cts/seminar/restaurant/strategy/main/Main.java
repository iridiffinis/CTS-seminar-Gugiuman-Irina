package cts.seminar.restaurant.strategy.main;

import cts.seminar.restaurant.strategy.clase.Card;
import cts.seminar.restaurant.strategy.clase.Cash;
import cts.seminar.restaurant.strategy.clase.Client;

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Andrei");
		client.realizeazaPlata(2000.0);
		client.setModPlata(new Card());
		client.realizeazaPlata(365.0);
		client.setModPlata(new Cash());
		client.realizeazaPlata(1000.0);

	}

}
