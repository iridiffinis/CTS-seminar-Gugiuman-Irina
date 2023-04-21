package cts.farmacie.factory_method;

public class FactoryMDurere implements Factory{

	@Override
	public Medicament createMedicament(String denumire, float pret) {
		return new MDurere(denumire, pret);
	}

}
