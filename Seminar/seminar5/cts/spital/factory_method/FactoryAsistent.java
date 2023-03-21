package cts.spital.factory_method;

public class FactoryAsistent implements Factory{

	@Override
	public PersonalSpital createPersonalSpital(String nume) {
		return new Asistent(nume);
	}

}
