package cts.seminar.restaurant.facade.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeseRestaurant {
	private Map<Integer, Masa> listaMese;

	public MeseRestaurant() {
		super();
		this.listaMese = new HashMap<Integer, Masa>();
	}
	
	public void adaugaMasa(Masa masa)
	{
		listaMese.put(masa.getNrMasa(), masa);
	}
	
	public Boolean esteMasaLibera(int nrMasa)
	{
		return listaMese.get(nrMasa).getMasaLibera();
	}
	
	public Boolean suntServeteleNoi(int nrMasa)
	{
		return listaMese.get(nrMasa).getAreServetele();
	}
}
