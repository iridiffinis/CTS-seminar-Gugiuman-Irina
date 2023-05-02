package cts.seminar.restaurant.strategy.clase;

public class Card implements ModPlata{

	@Override
	public void plateste(String numeClient, double sumaPlata) {
		System.out.println("Clientul "+numeClient+" plateste cu cardul suma de "+sumaPlata+" lei");
		
	}

}
