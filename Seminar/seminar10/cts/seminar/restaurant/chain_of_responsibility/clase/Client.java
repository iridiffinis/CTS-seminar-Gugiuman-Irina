package cts.seminar.restaurant.chain_of_responsibility.clase;

public class Client {
	private String nume;
	private String nrTelefon;
	private String adresaEmail;
	
	public Client(String nume, String adresaEmail, String nrTelefon) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.adresaEmail = adresaEmail;
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
	public String getAdresaEmail() {
		return adresaEmail;
	}
	public void setAdresaEmail(String adresaEmail) {
		this.adresaEmail = adresaEmail;
	}
	
	
}
