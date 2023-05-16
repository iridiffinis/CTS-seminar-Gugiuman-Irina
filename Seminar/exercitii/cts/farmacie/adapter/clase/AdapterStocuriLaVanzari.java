package cts.farmacie.adapter.clase;

import cts.farmacie.adapter.clase.stocuri.ISoftStocuri;
import cts.farmacie.adapter.clase.vanzare.ISoftVanzare;

public class AdapterStocuriLaVanzari implements ISoftVanzare{
	private ISoftStocuri softStocuri;
	private String idMedicament;
	
	public AdapterStocuriLaVanzari(ISoftStocuri softStocuri) {
		super();
		this.softStocuri = softStocuri;
	}

	@Override
	public void setareMedicament(String idMedicament) {
		// TODO Auto-generated method stub
		this.idMedicament=idMedicament;
	}

	@Override
	public Boolean verificareDisponibilitate(int nrMedicamente) {
		return softStocuri.verificaStocPentruMedicament(idMedicament, nrMedicamente);
	}

}
