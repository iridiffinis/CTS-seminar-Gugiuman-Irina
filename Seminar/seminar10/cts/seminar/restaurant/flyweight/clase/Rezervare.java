package cts.seminar.restaurant.flyweight.clase;

public class Rezervare {
	private int id;
	private int nrMasa;
	private int nrPersoane;
	private int oraRezervata;
	
	public Rezervare(int id, int nrMasa, int nrPersoane, int oraRezervata) {
		super();
		this.id = id;
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.oraRezervata = oraRezervata;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNrMasa() {
		return nrMasa;
	}
	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}
	public int getNrPersoane() {
		return nrPersoane;
	}
	public void setNrPersoane(int nrPersoane) {
		this.nrPersoane = nrPersoane;
	}
	public int getOraRezervata() {
		return oraRezervata;
	}
	public void setOraRezervata(int oraRezervata) {
		this.oraRezervata = oraRezervata;
	}
	@Override
	public String toString() {
		return "Rezervare [id=" + id + ", nrMasa=" + nrMasa + ", nrPersoane=" + nrPersoane + ", oraRezervata="
				+ oraRezervata + "]";
	}
	
	
}
