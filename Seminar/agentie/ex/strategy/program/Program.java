package ex.strategy.program;

import ex.strategy.clase.Card;
import ex.strategy.clase.Cash;
import ex.strategy.clase.Client;

public class Program {

	public static void main(String[] args) {
		Client client = new Client("Popescu");
		
		client.setModPlata(new Card());
		client.plateste(300);
		
		client.setModPlata(new Cash());
		client.plateste(100);

	}

}
