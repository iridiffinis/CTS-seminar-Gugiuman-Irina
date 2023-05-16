package cts.farmacie.command.main;

import cts.farmacie.command.clase.AjutorFarmacist;
import cts.farmacie.command.clase.ComandaMedicamente;
import cts.farmacie.command.clase.Farmacist;
import cts.farmacie.command.clase.PersonalFarmacie;

public class Main {
	public static void main(String[] args) {
		Farmacist farmacist = new Farmacist();
		PersonalFarmacie ajutorFarmacist = new AjutorFarmacist("Iulian");
		
		farmacist.preiaComenziMedicamente(new ComandaMedicamente("ibuprofen, paracetamol", ajutorFarmacist));
		farmacist.preiaComenziMedicamente(new ComandaMedicamente("trahisan, parasinus", new AjutorFarmacist("Elena")));
		farmacist.preiaComenziMedicamente(new ComandaMedicamente("algocalmin", new AjutorFarmacist("David")));
		farmacist.preiaComenziMedicamente(new ComandaMedicamente("nurofen", ajutorFarmacist));
		
		farmacist.onoreazaComanda();
		farmacist.onoreazaComanda();
		farmacist.onoreazaComanda();
		farmacist.preiaComenziMedicamente(new ComandaMedicamente("strepsils",new AjutorFarmacist("Carmen")));
		farmacist.onoreazaComanda();
		farmacist.preiaComenziMedicamente(new ComandaMedicamente("apa oxigenata",ajutorFarmacist));
		farmacist.onoreazaComanda();
		farmacist.onoreazaComanda();
	}
}
