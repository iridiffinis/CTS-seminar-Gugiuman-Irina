package cts.farmacie.flyweight.clase;

public class Client implements IClient{
	private String nume;
	private String nrAsigurare;
	
	public Client(String nume, String nrAsigurare) {
		super();
		this.nume = nume;
		this.nrAsigurare = nrAsigurare;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getNrAsigurare() {
		return nrAsigurare;
	}

	public void setNrAsigurare(String nrAsigurare) {
		this.nrAsigurare = nrAsigurare;
	}
	

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", nrAsigurare=" + nrAsigurare + "]";
	}

	@Override
	public void descriereAchizitie(Reteta reteta) {
		System.out.println("Clientul "+this.nume+" a achizitionat reteta "+reteta.toString());
	}

}
