package cts.restaurant.prototype;

public class Client implements IClient{
	private String nume;
	private int nrMasa;
	private int nrLocuriRezervate;
	public Client() {
		this.nume = "n/a";
		this.nrMasa = 0;
		this.nrLocuriRezervate = 0;
	}
	public Client(String nume, int nrMasa, int nrLocuriRezervate) {
		super();
		this.nume = nume;
		this.nrMasa = nrMasa;
		this.nrLocuriRezervate = nrLocuriRezervate;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getNrMasa() {
		return nrMasa;
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}

	public int getNrLocuriRezervate() {
		return nrLocuriRezervate;
	}

	public void setNrLocuriRezervate(int nrLocuriRezervate) {
		this.nrLocuriRezervate = nrLocuriRezervate;
	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", nrMasa=" + nrMasa + ", nrLocuriRezervate=" + nrLocuriRezervate + "]";
	}
	@Override
	public IClient copiaza() {
		Client clientNou = new Client();
		clientNou.setNume(nume);
		clientNou.setNrMasa(nrMasa);
		clientNou.setNrLocuriRezervate(nrLocuriRezervate);
		return clientNou;
	}

}
