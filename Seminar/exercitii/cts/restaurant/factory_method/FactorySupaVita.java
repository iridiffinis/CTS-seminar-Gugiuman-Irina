package cts.restaurant.factory_method;

public class FactorySupaVita implements Factory{

	@Override
	public Meniu createMeniu(int nrMasa) {
		return new SupaVita(nrMasa);
	}

}
