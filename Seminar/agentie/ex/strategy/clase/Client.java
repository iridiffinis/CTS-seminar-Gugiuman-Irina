package ex.strategy.clase;

public class Client {
	private String nume;
	private ModPlata modPlata;
	
	public Client(String nume, ModPlata modPlata) {
		super();
		this.nume = nume;
		this.modPlata = modPlata;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public ModPlata getModPlata() {
		return modPlata;
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public void plateste(double sumaPlata) {
		modPlata.plateste(this.nume, sumaPlata);
	}
	
	public Client(String nume) {
		super();
		this.nume=nume;
		this.modPlata=new Cash();
	}
}
