package cts.seminar.restaurant.flyweight.clase;

public class Client implements IClient{
	private String nume;
	private String nrTelefon;
	private String adresa;
	
	@Override
	public void descriereRezervare(Rezervare rezervare) {
		// TODO Auto-generated method stub
		System.out.println("Clientul "+this.nume+ " a rezervat "+rezervare.toString());
	}

	public Client(String nume, String nrTelefon, String adresa) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.adresa = adresa;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getNrTelefon() {
		return nrTelefon;
	}

	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", nrTelefon=" + nrTelefon + ", adresa=" + adresa + "]";
	}
	
}
