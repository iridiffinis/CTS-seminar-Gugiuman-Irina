package cts.restaurant.builder;

public class Rezervare {
	private String nume;
	private Boolean asezareGeam;
	private Boolean scauneErgonomice;
	private Boolean decorareaMesei;
	private Boolean muzicaAmbientala;
	private Boolean genMuzica;
	
	public Rezervare(String nume, Boolean asezareGeam, Boolean scauneErgonomice, Boolean decorareaMesei,
			Boolean muzicaAmbientala, Boolean genMuzica) {
		super();
		this.nume = nume;
		this.asezareGeam = asezareGeam;
		this.scauneErgonomice = scauneErgonomice;
		this.decorareaMesei = decorareaMesei;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = genMuzica;
	}

	public Rezervare() {
		super();
	}

	public String getNume() {
		return nume;
	}

	protected void setNume(String nume) {
		this.nume = nume;
	}

	public Boolean getAsezareGeam() {
		return asezareGeam;
	}

	protected void setAsezareGeam(Boolean asezareGeam) {
		this.asezareGeam = asezareGeam;
	}

	public Boolean getScauneErgonomice() {
		return scauneErgonomice;
	}

	protected void setScauneErgonomice(Boolean scauneErgonomice) {
		this.scauneErgonomice = scauneErgonomice;
	}

	public Boolean getDecorareaMesei() {
		return decorareaMesei;
	}

	protected void setDecorareaMesei(Boolean decorareaMesei) {
		this.decorareaMesei = decorareaMesei;
	}

	public Boolean getMuzicaAmbientala() {
		return muzicaAmbientala;
	}

	protected void setMuzicaAmbientala(Boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}

	public Boolean getGenMuzica() {
		return genMuzica;
	}

	protected void setGenMuzica(Boolean genMuzica) {
		this.genMuzica = genMuzica;
	}

	@Override
	public String toString() {
		return "Rezervare [nume=" + nume + ", asezareGeam=" + asezareGeam + ", scauneErgonomice=" + scauneErgonomice
				+ ", decorareaMesei=" + decorareaMesei + ", muzicaAmbientala=" + muzicaAmbientala + ", genMuzica="
				+ genMuzica + "]";
	}
	
	
}
