package cts.farmacie.adapter.clase.stocuri;

import java.util.HashMap;
import java.util.Map;

public class SoftStocuri implements ISoftStocuri{

	private Map<String, Integer> medicamente = new HashMap<String, Integer>();

	public void adaugaStoc(String idMedicament, int nrMedicamente) {
		this.medicamente.put(idMedicament, nrMedicamente);
	}
	@Override
	public Boolean verificaStocPentruMedicament(String idMedicament, int nrMedicamente) {
		if(medicamente.get(idMedicament) >=nrMedicamente)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
}
