package cts.seminar.restaurant.flyweight.clase;

import java.util.HashMap;

public class FabricaClienti {
	private HashMap<String, IClient> clienti;
	
	public FabricaClienti() {
		// TODO Auto-generated constructor stub
		clienti = new HashMap<String, IClient>();
	}
	
	public IClient getClient(String nume)
	{
		if(clienti.get(nume)!=null)
		{
			return clienti.get(nume);
		}
		else {
			IClient client = new Client(nume,"nespecificat","nespecificat");
			clienti.put(nume, client);
			return client;
		}
	}
}
