package cts.farmacie.state.clase;

public class StareAchizitionata implements Stare{

	@Override
	public void schimbareStare(Reteta reteta) {
		if(reteta.getStare() instanceof StareSolicitata)
		{
			reteta.setStare(this);
			System.out.println("Clientul a cumparat medicamentele retetei "+reteta.getCod());
		}
		else {
			System.out.println("Medicamentele retetei "+reteta.getCod()+" nu au fost achitate");
		}
	}
	
}
