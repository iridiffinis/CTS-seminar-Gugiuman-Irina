package cts.spital.factory_method;

public class FactoryInfirmier implements Factory{

	@Override
	public PersonalSpital createPersonalSpital(String nume) {
		return new Infirmier(nume);
	}

}
