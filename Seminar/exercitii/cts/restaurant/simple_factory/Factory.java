package cts.restaurant.simple_factory;

public class Factory {
	public Factory() {
		// TODO Auto-generated constructor stub
	}
	public Meniu createInstance(TipSupa tipSupa, int nrMasa)
	{
		switch (tipSupa) {
		case SUPA_LEGUME:
			return new SupaLegume(nrMasa);
		case SUPA_CIUPERCI:
			return new SupaCiuperci(nrMasa);
		case SUPA_VITA:
			return new SupaVita(nrMasa);
		default:
			return null;
		}
	}
}
