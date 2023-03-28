package cts.builder;

public class Pacient {
	private String nume="Anonim";
	private Boolean patRabatabil;
	private Boolean micDeJunInclus;
	private Boolean papuciDeCamera;
	

	public Pacient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pacient(String nume, Boolean patRabatabil, Boolean micDeJunInclus, Boolean papuciDeCamera) {
		super();
		this.nume = nume;
		this.patRabatabil = patRabatabil;
		this.micDeJunInclus = micDeJunInclus;
		this.papuciDeCamera = papuciDeCamera;
	}

	public String getNume() {
		return nume;
	}

	protected void setNume(String nume) {
		this.nume = nume;
	}

	public Boolean getPatRabatabil() {
		return patRabatabil;
	}

	protected void setPatRabatabil(Boolean patRabatabil) {
		this.patRabatabil = patRabatabil;
	}

	public Boolean getMicDeJunInclus() {
		return micDeJunInclus;
	}

	protected void setMicDeJunInclus(Boolean micDeJunInclus) {
		this.micDeJunInclus = micDeJunInclus;
	}

	public Boolean getPapuciDeCamera() {
		return papuciDeCamera;
	}

	protected void setPapuciDeCamera(Boolean papuciDeCamera) {
		this.papuciDeCamera = papuciDeCamera;
	}

	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", patRabatabil=" + patRabatabil + ", micDeJunInclus=" + micDeJunInclus
				+ ", papuciDeCamera=" + papuciDeCamera + "]";
	}
	
	
}
