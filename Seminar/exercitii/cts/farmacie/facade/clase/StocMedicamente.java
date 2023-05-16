package cts.farmacie.facade.clase;

import java.util.HashMap;
import java.util.Map;

public class StocMedicamente {
	private Map<String, Integer> medicamente = new HashMap<String, Integer>();

	public void adaugaStoc(String idMedicament, int nrMedicamente) {
		this.medicamente.put(idMedicament, nrMedicamente);
	}

	public Boolean esteMedicamentDisponibil(String idMedicament, int nrMedicamente) {
		if(medicamente.get(idMedicament) >=nrMedicamente)
		{
			return true;
		}
		else {
			return false;
		}
	} 
}
