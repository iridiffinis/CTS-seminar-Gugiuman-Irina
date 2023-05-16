package cts.farmacie.strategy.clase;

public class PlataCash implements ModPlata{

	@Override
	public void achizitioneaza(String numeClient, double sumaPlata) {
		// TODO Auto-generated method stub
		System.out.println("Clientul "+numeClient+" achizitioneaza cash medicamente de "+sumaPlata);
	}

}
