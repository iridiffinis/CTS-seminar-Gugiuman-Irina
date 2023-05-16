package cts.farmacie.adapter.main;

import cts.farmacie.adapter.clase.AdapterStocuriLaVanzari;
import cts.farmacie.adapter.clase.stocuri.SoftStocuri;
import cts.farmacie.adapter.clase.vanzare.ISoftVanzare;
import cts.farmacie.adapter.clase.vanzare.SoftVanzare;

public class Main {
	public static void main(String[] args) {
		SoftVanzare vanzare = new SoftVanzare();
		vanzare.adaugaComenzi("123", 5);
		vanzare.adaugaComenzi("456", 6);
		vanzare.adaugaComenzi("789", 9);
		
		vanzare.setareMedicament("456");
		System.out.println(vanzare.verificareDisponibilitate(2));
		vanzare.setareMedicament("789");
		System.out.println(vanzare.verificareDisponibilitate(11));
		
		SoftStocuri stocuri = new SoftStocuri();
		stocuri.adaugaStoc("123", 45);
		stocuri.adaugaStoc("456", 85);
		stocuri.adaugaStoc("789", 32);
		
		System.out.println(stocuri.verificaStocPentruMedicament("456", 44));
		System.out.println(stocuri.verificaStocPentruMedicament("123", 50));
		System.out.println(stocuri.verificaStocPentruMedicament("789", 10));
		
		AdapterStocuriLaVanzari adapter = new AdapterStocuriLaVanzari(stocuri);
		adapter.setareMedicament("789");
		System.out.println(adapter.verificareDisponibilitate(66));
		
	}
}
