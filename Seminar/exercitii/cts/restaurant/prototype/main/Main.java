package cts.restaurant.prototype.main;

import cts.restaurant.prototype.Client;
import cts.restaurant.prototype.IClient;

public class Main {

	public static void main(String[] args) {
		IClient client1 = new Client("Moraru",5,4);
		IClient client2 = new Client("Vasilescu",3,2);
		Client client1Nou = (Client) client1.copiaza();
		client1Nou.setNrMasa(7);
		client1Nou.setNrLocuriRezervate(3);
		Client client2Nou = (Client) client2.copiaza();
		client2Nou.setNrMasa(6);
		
		System.out.println(client1.toString());
		System.out.println(client2.toString());
		System.out.println(client1Nou.toString());
		System.out.println(client2Nou.toString());

	}

}
