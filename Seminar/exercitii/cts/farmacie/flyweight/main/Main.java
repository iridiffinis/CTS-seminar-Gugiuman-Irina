package cts.farmacie.flyweight.main;

import cts.farmacie.flyweight.clase.Client;
import cts.farmacie.flyweight.clase.FabricaFlyweightClienti;
import cts.farmacie.flyweight.clase.IClient;
import cts.farmacie.flyweight.clase.Reteta;

public class Main {
	public static void main(String[] args) {
		FabricaFlyweightClienti flyweightClienti = new FabricaFlyweightClienti();
		
		Reteta reteta1 = new Reteta(101, 25.32, 1);
		Reteta reteta2 = new Reteta(102, 84.12, 4);
		Reteta reteta3 = new Reteta(103, 52.65, 2);
		Reteta reteta4 = new Reteta(104, 98.25, 5);
		
		IClient client1 = flyweightClienti.getClient("Costel");
		client1.descriereAchizitie(reteta1);
		IClient client2 = flyweightClienti.getClient("Luca");
		client2.descriereAchizitie(reteta4);
		
		flyweightClienti.getClient("Luca").descriereAchizitie(reteta3);
		flyweightClienti.getClient("Costel").descriereAchizitie(reteta2);
		
	}
}
