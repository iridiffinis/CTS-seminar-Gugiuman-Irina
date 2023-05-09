package cts.seminar.restaurant.template.clase;

public class MasaLocala extends MasaRestaurant{

	public MasaLocala(int numarMasa) {
		super(numarMasa);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void curataMasa() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul curata masa "+getNumarMasa()+" pentru persoanele care asteapta la usa");
	}

	@Override
	protected void aseazaServetele() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul aseaza servetele pe masa "+getNumarMasa()+" pentru persoanele care astepta");
	}

	@Override
	protected void aseazaTacamuri() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul aseaza tacamuri pe masa "+getNumarMasa()+" pentru persoanele care astepta");
	}

	@Override
	protected void invitaPersoane() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul invita pesoanele la masa "+getNumarMasa());
	}

}
