package ex.flyweight.clase;

public class Optionale {
	private Boolean cina;
	private int nrExcursii;
	
	public Optionale(Boolean cina, int nrExcursii) {
		super();
		this.cina = cina;
		this.nrExcursii = nrExcursii;
	}

	public Boolean isCina() {
		return cina;
	}

	public void setCina(Boolean cina) {
		this.cina = cina;
	}

	public int getNrExcursii() {
		return nrExcursii;
	}

	public void setNrExcursii(int nrExcursii) {
		this.nrExcursii = nrExcursii;
	}
	
	
}
