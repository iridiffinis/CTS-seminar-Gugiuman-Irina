package cts.farmacie.factory_method;

public class FactoryMBody implements Factory{

	@Override
	public Medicament createMedicament(String denumire, float pret) {
		return new MBody(denumire, pret);
	}

}
