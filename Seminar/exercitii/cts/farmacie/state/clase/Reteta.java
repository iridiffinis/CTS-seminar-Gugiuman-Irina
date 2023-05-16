package cts.farmacie.state.clase;

public class Reteta {
	Stare stare;
	String cod;
	public Reteta(String cod) {
		super();
		this.cod = cod;
		this.stare = new StareEmisa();
	}
	public Stare getStare() {
		return stare;
	}
	public void setStare(Stare stare) {
		this.stare = stare;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	
	public void emitereReteta()
	{
		Stare emisa = new StareEmisa();
		emisa.schimbareStare(this);
	}
	
	public void solicitareReteta()
	{
		Stare solicitata = new StareSolicitata();
		solicitata.schimbareStare(this);
	}
	
	public void achizitionareReteta()
	{
		Stare achizitionata = new StareAchizitionata();
		achizitionata.schimbareStare(this);
	}
}
