package cts.seminar.restaurant.template.clase;

public class MasaRezervata extends MasaRestaurant{

	private String oraRezervare;
	
	public MasaRezervata(int numarMasa, String oraRezervare) {
		super(numarMasa);
		// TODO Auto-generated constructor stub
		this.oraRezervare=oraRezervare;
	}

	@Override
	protected void curataMasa() {
		// TODO Auto-generated method stub
		System.out.println("Curata masa "+getNumarMasa()+" pentru rezervarea de la ora "+this.oraRezervare);
	}

	@Override
	protected void aseazaServetele() {
		// TODO Auto-generated method stub
		System.out.println("Pune servetele la masa "+getNumarMasa()+" pentru rezervare de la ora "+this.oraRezervare);
	}

	@Override
	protected void aseazaTacamuri() {
		// TODO Auto-generated method stub
		System.out.println("Pune tacamuri la masa "+getNumarMasa()+" pentru rezervare de la ora "+this.oraRezervare);
	}

	@Override
	protected void invitaPersoane() {
		// TODO Auto-generated method stub
		System.out.println("Atunci cand ajungeti, va asteptam la masa "+getNumarMasa()+" la ora "+this.oraRezervare);
	}

}
