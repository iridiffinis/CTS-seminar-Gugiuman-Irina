package cts.seminar.restaurant.strategy.clase;

public class Client {
	private String nume;
	private ModPlata modPlata;
	
	public Client(String nume, ModPlata modPlata) {
		super();
		this.nume = nume;
		this.modPlata = modPlata;
	}
	
	public Client(String nume) {
		super();
		this.nume=nume;
		this.modPlata = new Cash();
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	};
	
	public void realizeazaPlata(double sumaPlata) {
		modPlata.plateste(this.nume, sumaPlata);
	}
}
