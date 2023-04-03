package cts.restaurant.builder.main;

import cts.restaurant.builder.Rezervare;
import cts.restaurant.builder.RezervareBuilder;

public class Main {

	public static void main(String[] args) {
		RezervareBuilder rezervareBuilder = new RezervareBuilder("Ionescu");
		Rezervare rezervare1 = rezervareBuilder.setScauneErgonomice(true).setAsezareGeam(true).build();
		Rezervare rezervare2 = new RezervareBuilder("Cotescu").build();
		Rezervare rezervare3 = new RezervareBuilder("Moraru").setDecorareaMesei(true).setGenMuzica(true).setMuzicaAmbientala(true).build();
		Rezervare rezervare4 = rezervareBuilder.setGenMuzica(true).build();
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		System.out.println(rezervare3.toString());
		System.out.println(rezervare4.toString());

	}

}
