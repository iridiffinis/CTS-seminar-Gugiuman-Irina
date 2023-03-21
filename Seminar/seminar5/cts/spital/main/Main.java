package cts.spital.main;

import java.util.ArrayList;
import java.util.List;

import cts.spital.simple_factory.Factory;
import cts.spital.simple_factory.PersonalSpital;
import cts.spital.simple_factory.TipPersonalSpital;

public class Main {

	public static void main(String[] args) {
		Factory factory = new Factory();
		PersonalSpital asistent = factory.createInstance(TipPersonalSpital.ASISTENT, "Popescu Ion");
		PersonalSpital medic = factory.createInstance(TipPersonalSpital.MEDIC, "Ionescu Dan");
		PersonalSpital brancardier = factory.createInstance(TipPersonalSpital.BRANCARDIER, "Costescu Maria");
		
		asistent.descriere();
		medic.descriere();
		brancardier.descriere();
		System.out.println();
		
		List<PersonalSpital> listaPersonal = new ArrayList<>();
		listaPersonal.add(asistent);
		listaPersonal.add(medic);
		listaPersonal.add(brancardier);
		listaPersonal.add(factory.createInstance(TipPersonalSpital.MEDIC, "Dan"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.BRANCARDIER, "Cristi"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.ASISTENT, "Gabi"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.ANESTEZIST, "Irina"));
		
		for (PersonalSpital personal : listaPersonal) {
			personal.descriere();
		}

	}

}
