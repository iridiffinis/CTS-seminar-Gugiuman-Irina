package cts.restaurant.builder;

public class RezervareBuilder implements Builder{
	private Rezervare rezervare;
	
	public RezervareBuilder(String nume)
	{
		this.rezervare = new Rezervare(nume,false,false,false, false,false);
	}
	
	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return this.rezervare;
	}
	
	public RezervareBuilder setAsezareGeam(Boolean asezareGeam)
	{
		this.rezervare.setAsezareGeam(asezareGeam);
		return this;
	}
	
	public RezervareBuilder setScauneErgonomice(Boolean scauneErgonomice)
	{
		this.rezervare.setScauneErgonomice(scauneErgonomice);
		return this;
	}
	
	public RezervareBuilder setDecorareaMesei(Boolean decorareaMesei)
	{
		this.rezervare.setDecorareaMesei(decorareaMesei);
		return this;
	}
	
	public RezervareBuilder setMuzicaAmbientala(Boolean muzicaAmbientala)
	{
		this.rezervare.setMuzicaAmbientala(muzicaAmbientala);
		return this;
	}
	
	public RezervareBuilder setGenMuzica(Boolean genMuzica)
	{
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}

}
