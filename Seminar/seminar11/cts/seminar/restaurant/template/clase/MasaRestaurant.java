package cts.seminar.restaurant.template.clase;

public abstract class MasaRestaurant {
	private int numarMasa;

	public MasaRestaurant(int numarMasa) {
		super();
		this.numarMasa = numarMasa;
	}
	
	public int getNumarMasa() {
		return numarMasa;
	}

	public void setNumarMasa(int numarMasa) {
		this.numarMasa = numarMasa;
	}

	protected abstract void curataMasa();
	protected abstract void aseazaServetele();
	protected abstract void aseazaTacamuri();
	protected abstract void invitaPersoane();
	public final void ocupaMasa()
	{
		curataMasa();
		aseazaServetele();
		aseazaTacamuri();
		invitaPersoane();
	}
}
