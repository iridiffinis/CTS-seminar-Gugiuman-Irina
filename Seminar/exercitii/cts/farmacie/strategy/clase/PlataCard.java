package cts.farmacie.strategy.clase;

public class PlataCard implements ModPlata{

	@Override
	public void achizitioneaza(String numeClient, double sumaPlata) {
		System.out.println("Clientul "+numeClient+" achizitioneaza cu cardul medicamente de "+sumaPlata);
	}

}
