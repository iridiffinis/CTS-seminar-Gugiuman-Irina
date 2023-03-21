package cts.spital.factory_method;

public class FactoryMedic implements Factory{

	@Override
	public PersonalSpital createPersonalSpital(String nume) {
		return new Medic(nume);
	}

}
