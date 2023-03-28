package cts.builder;

public class ContBancar {
	private String detinator;
	private double suma;
	private double sumaBlocata;
	private String moneda;
	
	private boolean cardAtasat;
	private boolean internetBanking;
	private boolean contSalariu;
	
	public ContBancar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContBancar(String detinator, double suma, double sumaBlocata, String moneda, boolean cardAtasat,
			boolean internetBanking, boolean contSalariu) {
		super();
		this.detinator = detinator;
		this.suma = suma;
		this.sumaBlocata = sumaBlocata;
		this.moneda = moneda;
		this.cardAtasat = cardAtasat;
		this.internetBanking = internetBanking;
		this.contSalariu = contSalariu;
	}

	public String getDetinator() {
		return detinator;
	}

	public void setDetinator(String detinator) {
		this.detinator = detinator;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public double getSumaBlocata() {
		return sumaBlocata;
	}

	public void setSumaBlocata(double sumaBlocata) {
		this.sumaBlocata = sumaBlocata;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public boolean isCardAtasat() {
		return cardAtasat;
	}

	public void setCardAtasat(boolean cardAtasat) {
		this.cardAtasat = cardAtasat;
	}

	public boolean isInternetBanking() {
		return internetBanking;
	}

	public void setInternetBanking(boolean internetBanking) {
		this.internetBanking = internetBanking;
	}

	public boolean isContSalariu() {
		return contSalariu;
	}

	public void setContSalariu(boolean contSalariu) {
		this.contSalariu = contSalariu;
	}

	@Override
	public String toString() {
		return "ContBancar [detinator=" + detinator + ", suma=" + suma + ", sumaBlocata=" + sumaBlocata + ", moneda="
				+ moneda + ", cardAtasat=" + cardAtasat + ", internetBanking=" + internetBanking + ", contSalariu="
				+ contSalariu + "]";
	}
	
	
	
}
