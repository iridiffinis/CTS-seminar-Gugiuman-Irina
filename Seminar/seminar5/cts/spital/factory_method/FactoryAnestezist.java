package cts.spital.factory_method;

public class FactoryAnestezist implements Factory{

	@Override
	public PersonalSpital createPersonalSpital(String nume) {
		return new Anestezist(nume);
	}

}
