package cts.farmacie.factory_method;

public class FactoryMRaceala implements Factory{

	@Override
	public Medicament createMedicament(String denumire, float pret) {
		return new MRaceala(denumire, pret);
	}

}
