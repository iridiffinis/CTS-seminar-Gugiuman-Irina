package cts.farmacie.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweightClienti {
	private Map<String, IClient> clienti;

	public FabricaFlyweightClienti() {
		super();
		this.clienti = new HashMap<String, IClient>();
	}
	
	public IClient getClient(String nume)
	{
		if(clienti.get(nume)!=null)
		{
			return clienti.get(nume);
		}
		else {
			IClient client = new Client(nume,"n/a");
			clienti.put(nume, client);
			return client;
		}
	}
}
