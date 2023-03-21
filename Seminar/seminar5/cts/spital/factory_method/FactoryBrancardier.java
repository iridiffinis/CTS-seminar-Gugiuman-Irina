package cts.spital.factory_method;

public class FactoryBrancardier implements Factory{

	@Override
	public PersonalSpital createPersonalSpital(String nume) {
		return new Brancardier(nume);
	}

}
