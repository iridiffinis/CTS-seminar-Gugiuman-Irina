package cts.farmacie.adapter.clase.vanzare;

import java.util.HashMap;
import java.util.Map;

public class SoftVanzare implements ISoftVanzare{
	private String idMedicamentSetat;
	private Map<String, Integer> medicamente = new HashMap<String, Integer>();

	public void adaugaComenzi(String idMedicament, int nrMedicamente) {
		this.medicamente.put(idMedicament, nrMedicamente);
	}

	@Override
	public void setareMedicament(String idMedicament) {
		// TODO Auto-generated method stub
		this.idMedicamentSetat=idMedicament;
	}

	@Override
	public Boolean verificareDisponibilitate(int nrMedicamente) {
		if(medicamente.get(idMedicamentSetat) >= nrMedicamente)
		{
			return true;
		}
		else {
			return false;
		}
	}

}
