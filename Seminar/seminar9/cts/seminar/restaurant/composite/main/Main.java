package cts.seminar.restaurant.composite.main;

import cts.seminar.restaurant.composite.clase.Item;
import cts.seminar.restaurant.composite.clase.Produs;
import cts.seminar.restaurant.composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		Item meniu = new Sectiune("Meniu restaurant");
		
		//sectiuni
		Item sectiuneBauturi = new Sectiune("Bauturi");
		Item sectiuneStartere = new Sectiune("Startere");
		
		//subsectiuni
		Item subsectiuneCafele = new Sectiune("Cafele");
		Item subsectiuneSucuri = new Sectiune("Sucuri");
		
		//produse
		Item produsCafeaNeagra = new Produs("Cafea Neagra");
		Item produsCafeaAlba = new Produs("Cafea Alba");
		Item produsCocaCola = new Produs("Coca Cola");
		Item produsPepsi = new Produs("Pepsi");
		Item produsApaPlata = new Produs("Apa Plata");
		Item bruschete = new Produs("bruschete");
		
		//legaturi
		try {
			subsectiuneCafele.adaugareItem(produsCafeaNeagra);
			subsectiuneCafele.adaugareItem(produsCafeaAlba);
			
			subsectiuneSucuri.adaugareItem(produsCocaCola);
			subsectiuneSucuri.adaugareItem(produsPepsi);
			
			sectiuneBauturi.adaugareItem(subsectiuneCafele);
			sectiuneBauturi.adaugareItem(subsectiuneSucuri);
			sectiuneBauturi.adaugareItem(produsApaPlata);
			sectiuneStartere.adaugareItem(bruschete);
			
			meniu.adaugareItem(sectiuneBauturi);
			meniu.adaugareItem(sectiuneStartere);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		meniu.descriere("  ");

	}

}
