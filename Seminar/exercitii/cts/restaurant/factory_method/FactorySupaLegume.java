package cts.restaurant.factory_method;

public class FactorySupaLegume implements Factory{

	@Override
	public Meniu createMeniu(int nrMasa) {
		return new SupaLegume(nrMasa);
	}

}
