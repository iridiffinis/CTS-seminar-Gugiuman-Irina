package cts.farmacie.state.clase;

public class StareSolicitata implements Stare{

	@Override
	public void schimbareStare(Reteta reteta) {
		if(!(reteta.getStare() instanceof StareSolicitata))
		{
			reteta.setStare(this);
			System.out.println("Clientul solicita medicamente pe baza retetei "+reteta.getCod());
		}
		else {
			System.out.println("Medicamente retetei "+reteta.getCod()+" au fost deja solicitate");
		}
	}
	
}
