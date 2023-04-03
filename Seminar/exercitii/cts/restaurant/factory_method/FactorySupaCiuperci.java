package cts.restaurant.factory_method;

public class FactorySupaCiuperci implements Factory{

	@Override
	public Meniu createMeniu(int nrMasa) {
		return new SupaCiuperci(nrMasa);
	}

}
