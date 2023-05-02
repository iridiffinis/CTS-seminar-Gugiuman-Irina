package cts.seminar.restaurant.strategy.clase;

public class Cash implements ModPlata{

	@Override
	public void plateste(String numeClient, double sumaPlata) {
		System.out.println("Clientul "+numeClient+" plateste cash suma de "+sumaPlata+" lei");
		
	}

}
