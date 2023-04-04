package cts.recap_singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class RegistryPachete {
	private static Map<String, PachetTuristic> colectie = new HashMap<String, PachetTuristic>();
	
	private RegistryPachete() {
		// TODO Auto-generated constructor stub
	}
	public static void register(String nume, PachetTuristic value) throws Exception {
		if(colectie.containsKey(nume))
			throw new Exception("Numele "+nume+" este deja inregistrat");
		else {
			colectie.put(nume, value);
		}
	}
	public static PachetTuristic getPachet(String nume) {
		return colectie.get(nume);
	}
}
