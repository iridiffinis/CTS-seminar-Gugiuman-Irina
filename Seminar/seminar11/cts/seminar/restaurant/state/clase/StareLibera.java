package cts.seminar.restaurant.state.clase;

public class StareLibera implements Stare{

	@Override
	public void schimbareStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStare() instanceof StareLibera))
		{
			masa.setStare(this);
			System.out.println("Masa nr. "+masa.getNumar()+" este eliberata");
		}
		else {
			System.out.println("Masa este deja libera");
		}
	}

}
