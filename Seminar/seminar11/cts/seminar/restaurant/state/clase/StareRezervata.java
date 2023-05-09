package cts.seminar.restaurant.state.clase;

public class StareRezervata implements Stare{

	@Override
	public void schimbareStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStare() instanceof StareLibera)
		{
			masa.setStare(this);
			System.out.println("Masa nr. "+masa.getNumar()+" este rezervata in acest moment");
		}
		else {
			System.out.println("Masa nu poate fi rezervata");
		}
	}

}
