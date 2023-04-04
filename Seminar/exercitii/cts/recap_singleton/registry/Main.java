package cts.recap_singleton.registry;

public class Main {

	public static void main(String[] args) {
		PachetCazare cazare1 = new PachetCazare();
		PachetCazare cazare2 = new PachetCazare();
		PachetTransport transport1 = new PachetTransport();
		
		try {
			RegistryPachete.register("Cazare", cazare1);
			RegistryPachete.register("Transport", transport1);
			
			//RegistryPachete.register("Cazare", cazare2);
			
			RegistryPachete.getPachet("Cazare").descriere();
			RegistryPachete.getPachet("Transport").descriere();
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
