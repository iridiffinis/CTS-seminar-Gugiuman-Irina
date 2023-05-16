package cts.farmacie.facade.main;

import cts.farmacie.facade.clase.FacadeFarmacie;

public class Main {

	public static void main(String[] args) {
		FacadeFarmacie farmacie = new FacadeFarmacie();
		System.out.println(farmacie.verificareAchizitieMedicament("Marcel", "asd"));
		System.out.println(farmacie.verificareAchizitieMedicament("Vasile", "cde"));
		System.out.println(farmacie.verificareAchizitieMedicament("Mirela", "mju"));
		System.out.println(farmacie.verificareAchizitieMedicament("Ioana", "asd"));
		System.out.println(farmacie.verificareAchizitieMedicament("Mirela", "lkj"));
		System.out.println(farmacie.verificareAchizitieMedicament("Vasile", "bhu"));
		System.out.println(farmacie.verificareAchizitieMedicament("Marcel", "mju"));
	}

}
