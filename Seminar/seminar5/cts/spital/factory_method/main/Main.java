package cts.spital.factory_method.main;

import java.util.ArrayList;
import java.util.List;

import cts.spital.factory_method.Factory;
import cts.spital.factory_method.FactoryAsistent;
import cts.spital.factory_method.FactoryInfirmier;
import cts.spital.factory_method.FactoryMedic;
import cts.spital.factory_method.Infirmier;
import cts.spital.factory_method.PersonalSpital;

public class Main {

	public static void main(String[] args) {
		Factory fabricaAsistenti = new FactoryAsistent();
		Factory fabricaMedici = new FactoryMedic();
		Factory fabricaInfirmier = new FactoryInfirmier();
		
		Infirmier infirmier = (Infirmier) fabricaInfirmier.createPersonalSpital("Marius");
		infirmier.setAniVechime(15);
		
		List<PersonalSpital> listaPesonal = new ArrayList<>();
		listaPesonal.add(fabricaAsistenti.createPersonalSpital("Popescu"));
		listaPesonal.add(fabricaAsistenti.createPersonalSpital("Ioenscu"));
		listaPesonal.add(fabricaMedici.createPersonalSpital("Marinescu"));
		
		listaPesonal.add(infirmier);
		
		for (PersonalSpital personal : listaPesonal) {
			personal.descriere();
		}

	}

}
