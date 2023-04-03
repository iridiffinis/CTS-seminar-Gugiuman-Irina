package cts.restaurant.simple_factory.main;

import java.util.ArrayList;
import java.util.List;

import cts.restaurant.simple_factory.Factory;
import cts.restaurant.simple_factory.Meniu;
import cts.restaurant.simple_factory.TipSupa;

public class Main {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Meniu supaCiuperci = factory.createInstance(TipSupa.SUPA_CIUPERCI, 8);
		Meniu supaLegume = factory.createInstance(TipSupa.SUPA_LEGUME, 3);
		Meniu supaVita = factory.createInstance(TipSupa.SUPA_VITA, 4);
		
		supaCiuperci.descriere();
		supaLegume.descriere();
		supaVita.descriere();
		System.out.println();
		
		List<Meniu> listaSupe = new ArrayList<Meniu>();
		listaSupe.add(supaLegume);
		listaSupe.add(supaCiuperci);
		listaSupe.add(supaVita);
		listaSupe.add(factory.createInstance(TipSupa.SUPA_CIUPERCI, 2));
		listaSupe.add(factory.createInstance(TipSupa.SUPA_VITA, 5));
		listaSupe.add(factory.createInstance(TipSupa.SUPA_CIUPERCI, 6));
		listaSupe.add(factory.createInstance(TipSupa.SUPA_LEGUME, 9));
		
		for (Meniu supe : listaSupe) {
			supe.descriere();
		}

	}

}
