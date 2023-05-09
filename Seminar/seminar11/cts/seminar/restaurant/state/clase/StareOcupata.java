package cts.seminar.restaurant.state.clase;

public class StareOcupata implements Stare{

	@Override
	public void schimbareStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStare() instanceof StareOcupata))
		{
			masa.setStare(this);
			System.out.println("Masa nr. "+masa.getNumar()+" este ocupata in acest moment");
		}
		else {
			System.out.println("Masa nu poate fi ocupata");
		}
	}

}
