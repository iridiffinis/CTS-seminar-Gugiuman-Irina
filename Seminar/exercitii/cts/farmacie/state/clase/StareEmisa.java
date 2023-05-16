package cts.farmacie.state.clase;

public class StareEmisa implements Stare{

	@Override
	public void schimbareStare(Reteta reteta) {
		if(!(reteta.getStare() instanceof StareEmisa))
		{
			reteta.setStare(this);
			System.out.println("Reteta "+reteta.getCod()+" a fost emisa de medicul de familie");;
		}
		else {
			System.out.println("Reteta a fost deja emisa");
		}
	}

}
