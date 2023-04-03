package cts.restaurant.factory_method.main;

import java.util.ArrayList;
import java.util.List;

import cts.restaurant.factory_method.Factory;
import cts.restaurant.factory_method.FactorySupaCiuperci;
import cts.restaurant.factory_method.FactorySupaLegume;
import cts.restaurant.factory_method.FactorySupaVita;
import cts.restaurant.factory_method.Meniu;
import cts.restaurant.factory_method.SupaCiuperci;

public class Main {

	public static void main(String[] args) {
		Factory fabricaSupeLegume = new FactorySupaLegume();
		Factory fabricaSupeCiuperci = new FactorySupaCiuperci();
		Factory fabricaSupeVita = new FactorySupaVita();
		
		List<Meniu> listaSupe = new ArrayList<Meniu>();
		listaSupe.add(fabricaSupeLegume.createMeniu(7));
		listaSupe.add(fabricaSupeVita.createMeniu(9));
		listaSupe.add(fabricaSupeCiuperci.createMeniu(6));
		
		SupaCiuperci supaCiuperci = (SupaCiuperci) fabricaSupeCiuperci.createMeniu(5);
		
		listaSupe.add(supaCiuperci);
		
		for (Meniu supe : listaSupe) {
			supe.descriere();
		}

	}

}
