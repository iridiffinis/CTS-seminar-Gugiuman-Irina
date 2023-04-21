package cts.farmacie.factory_method.main;

import java.util.ArrayList;
import java.util.List;

import cts.farmacie.factory_method.FactoryMBody;
import cts.farmacie.factory_method.FactoryMDurere;
import cts.farmacie.factory_method.FactoryMRaceala;
import cts.farmacie.factory_method.MDurere;
import cts.farmacie.factory_method.MRaceala;
import cts.farmacie.factory_method.Medicament;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//se ceeaza fabricile
		FactoryMRaceala factoryMRaceala = new FactoryMRaceala();
		FactoryMDurere factoryMDurere = new FactoryMDurere();
		FactoryMBody factoryMBody = new FactoryMBody();
		
		//se creeaza medicamentele cu ajutorul fabricilor
		List<Medicament> listaMedicamente = new ArrayList<Medicament>();
		listaMedicamente.add(factoryMRaceala.createMedicament("Sintusin", (float) 54.23));
		listaMedicamente.add(factoryMDurere.createMedicament("Paduden", (float) 44.55));
		listaMedicamente.add(factoryMBody.createMedicament("SindolorGel", (float) 32.99));
		listaMedicamente.add(factoryMDurere.createMedicament("Nurofen", (float) 55.22));
		listaMedicamente.add(factoryMRaceala.createMedicament("Parasinus", (float) 25.65));
		
		MDurere med1 = (MDurere) factoryMDurere.createMedicament("Ibuprofen", (float) 15.22);
		MRaceala med2 = (MRaceala) factoryMRaceala.createMedicament("Trahisan", (float) 54.99);
		
		listaMedicamente.add(med1);
		listaMedicamente.add(med2);
		
		for (Medicament medicament : listaMedicamente) {
			medicament.descriere();
		}
		

	}

}
