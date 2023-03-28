package cts.builder;

public class PacientBuilder implements BuilderSpital{
	private Pacient pacient;
	public PacientBuilder(String nume) {
		this.pacient = new Pacient(nume,false,false,false);
	}
	@Override
	public Pacient build() {
		// TODO Auto-generated method stub
		return this.pacient;
	}
	
	
//	public PacientBuilder setNume(String nume) {
//		this.pacient.setNume(nume);
//		return this;
//	}
	
	public PacientBuilder setPatRabatabil(Boolean patRabatabil) {
		this.pacient.setPatRabatabil(patRabatabil);
		return this;
	}
	
	public PacientBuilder setMicDeJunInclus(Boolean micDeJunInclus) {
		this.pacient.setMicDeJunInclus(micDeJunInclus);
		return this;
	}
	
	public PacientBuilder setPapuciDeCamera(Boolean papuciDeCamera) {
		this.pacient.setPapuciDeCamera(papuciDeCamera);
		return this;
	}
}
