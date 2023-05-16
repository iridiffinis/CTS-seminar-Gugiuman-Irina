package cts.farmacie.facade.clase;

import java.util.HashMap;
import java.util.Map;

public class ClientiFarmacie {
	private Map<String, Client> listaClienti;

	public ClientiFarmacie() {
		super();
		this.listaClienti = new HashMap<String, Client>();
	}
	
	public void adaugaClient(Client client)
	{
		this.listaClienti.put(client.getNumeClient(), client);
	}
	
	public Boolean esteRetetaValida(String numeClient)
	{
		return listaClienti.get(numeClient).isRetetaValida();
	}
	
	public Boolean esteCardSanatateValid(String numeClient)
	{
		return listaClienti.get(numeClient).isCardSanatateValid();
	}
}
