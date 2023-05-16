package cts.farmacie.facade.clase;

public class FacadeFarmacie {
	private ClientiFarmacie clientiFarmacie;
	private StocMedicamente medicamente;
	
	public FacadeFarmacie() {
		this.clientiFarmacie = new ClientiFarmacie();
		this.clientiFarmacie.adaugaClient(new Client("Marcel", true, true));
		this.clientiFarmacie.adaugaClient(new Client("Vasile", true, false));
		this.clientiFarmacie.adaugaClient(new Client("Mirela", false, true));
		this.clientiFarmacie.adaugaClient(new Client("Ioana", false, false));
		this.medicamente=new StocMedicamente();
		this.medicamente.adaugaStoc("asd", 45);
		this.medicamente.adaugaStoc("cde", 12);
		this.medicamente.adaugaStoc("mju", 63);
		this.medicamente.adaugaStoc("lkj", 85);
		this.medicamente.adaugaStoc("bhu", 27);
	}
	
	public String verificareAchizitieMedicament(String numeClient, String idMedicament)
	{
		if(clientiFarmacie.esteRetetaValida(numeClient))
		{
			if(medicamente.esteMedicamentDisponibil(idMedicament, 3))
			{
				if(clientiFarmacie.esteCardSanatateValid(numeClient))
				{
					return "Tranzactia poate fi efectuata";
				}
				else {
					return "Card de sanatate invalid";
				}
			}
			else {
				return "Medicament indisponibil";
			}
		}
		else {
			return "Reteta nu este valida";
		}
	}
}
