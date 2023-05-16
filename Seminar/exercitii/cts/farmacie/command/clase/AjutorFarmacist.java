package cts.farmacie.command.clase;

public class AjutorFarmacist implements PersonalFarmacie{
	private String nume;
		
	public AjutorFarmacist(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void aducereMedicamente(String comanda) {
		System.out.println("Ajutorul de farmacist "+this.nume+" a preluat comanda: "+comanda);
	}


}
