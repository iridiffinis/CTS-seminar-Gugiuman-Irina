package cts.seminar.restaurant.state.clase;

public class Masa {
	int numar;
	Stare stare;
	public Masa(int numar) {
		super();
		this.numar = numar;
		this.stare = new StareLibera();
	}
	public int getNumar() {
		return numar;
	}
	public void setNumar(int numar) {
		this.numar = numar;
	}
	public Stare getStare() {
		return stare;
	}
	protected void setStare(Stare stare) {
		this.stare = stare;
	}
	
	public void rezervaMasa()
	{
		Stare rezervata = new StareRezervata();
		rezervata.schimbareStare(this);
	}
	
	public void ocupaMasa()
	{
		Stare ocupata = new StareOcupata();
		ocupata.schimbareStare(this);
	}
	
	public void elibereazaMasa()
	{
		Stare eliberata = new StareLibera();
		eliberata.schimbareStare(this);
	}
	
	public void ridicaRezervare()
	{
		Stare ocupata = new StareOcupata();
		ocupata.schimbareStare(this);
	}
	
	public void anuleazaRezervarea()
	{
		Stare eliberata = new StareLibera();
		eliberata.schimbareStare(this);
	}
}
