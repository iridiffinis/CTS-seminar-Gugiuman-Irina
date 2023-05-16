package cts.farmacie.composite.main;

import cts.farmacie.composite.clase.Item;
import cts.farmacie.composite.clase.Medicament;
import cts.farmacie.composite.clase.Sectiune;

public class Main {
	public static void main(String[] args) {
		Item catalog = new Sectiune("Catalog medicamente");
		
		Item sectiuneRaceala=new Sectiune("Raceala");
		Item sectiuneDurere=new Sectiune("Durere");
		Item sectiuneAntibiotice=new Sectiune("Antibiotice");
		
		Item subsectiuneAdulti = new Sectiune("Adulti");
		Item subsectiuneCopii= new Sectiune("Copii");
		
		Item medicament1 = new Medicament("Nurofen");
		Item medicament2 = new Medicament("Algocalmin");
		Item medicament3 = new Medicament("Parasinus");
		Item medicament4 = new Medicament("Sintusin");
		Item medicament5 = new Medicament("Simbi Flora");
		
		try {
			subsectiuneAdulti.adaugareItem(medicament2);
			subsectiuneCopii.adaugareItem(medicament1);
			
			sectiuneRaceala.adaugareItem(medicament3);
			sectiuneRaceala.adaugareItem(medicament4);
			sectiuneDurere.adaugareItem(subsectiuneAdulti);
			sectiuneDurere.adaugareItem(subsectiuneCopii);
			sectiuneAntibiotice.adaugareItem(medicament5);
			
			catalog.adaugareItem(sectiuneRaceala);
			catalog.adaugareItem(sectiuneDurere);
			catalog.adaugareItem(sectiuneAntibiotice);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		catalog.descriere("   ");
	}
}
