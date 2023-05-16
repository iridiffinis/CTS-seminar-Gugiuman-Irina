package cts.farmacie.facade.clase;

public class Client {
	private String numeClient;
	private Boolean retetaValida;
	private Boolean cardSanatateValid;
	
	public Client(String numeClient, Boolean retetaValida, Boolean cardSanatateValid) {
		super();
		this.numeClient = numeClient;
		this.retetaValida = retetaValida;
		this.cardSanatateValid = cardSanatateValid;
	}

	public String getNumeClient() {
		return numeClient;
	}

	public void setNumeClient(String numeClient) {
		this.numeClient = numeClient;
	}

	public Boolean isRetetaValida() {
		return retetaValida;
	}

	public void setRetetaValida(Boolean retetaValida) {
		this.retetaValida = retetaValida;
	}

	public Boolean isCardSanatateValid() {
		return cardSanatateValid;
	}

	public void setCardSanatateValid(Boolean cardSanatateValid) {
		this.cardSanatateValid = cardSanatateValid;
	}
	
	
}
