package cts.seminar.restaurant.observer.main;

import cts.seminar.restaurant.observer.clase.ClientRestaurant;
import cts.seminar.restaurant.observer.clase.Observer;
import cts.seminar.restaurant.observer.clase.Restaurant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant restaurant = new Restaurant("Bonita");
		
		Observer client1 = new ClientRestaurant("Marius");
		Observer client2 = new ClientRestaurant("Maria");
		Observer client3 = new ClientRestaurant("Vlad");
		
		restaurant.adaugaObserver(client1);
		restaurant.adaugaObserver(client2);
		restaurant.notificareOfertaPret();
		restaurant.stergereObserver(client1);
		restaurant.adaugaObserver(client3);
		restaurant.notificaSchimbareMeniu();
	}

}
