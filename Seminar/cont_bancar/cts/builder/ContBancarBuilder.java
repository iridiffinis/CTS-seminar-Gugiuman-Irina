package cts.builder;

public class ContBancarBuilder implements Builder{
	private String detinator;
	private double suma;
	private double sumaBlocata;
	private String moneda;
	
	private boolean cardAtasat;
	private boolean internetBanking;
	private boolean contSalariu;
	
	public ContBancarBuilder() {
		moneda = "RON";
	}

	public ContBancarBuilder setDetinator(String detinator) {
		this.detinator = detinator;
		return this;
	}

	public ContBancarBuilder setSuma(double suma) {
		this.suma = suma;
		return this;
	}

	public ContBancarBuilder setSumaBlocata(double sumaBlocata) {
		this.sumaBlocata = sumaBlocata;
		return this;
	}

	public ContBancarBuilder setMoneda(String moneda) {
		this.moneda = moneda;
		return this;
	}

	public ContBancarBuilder setCardAsociat(boolean cardAsociat) {
		this.cardAtasat = cardAsociat;
		return this;
	}

	public ContBancarBuilder setInternetBanking(boolean internetBanking) {
		this.internetBanking = internetBanking;
		return this;
	}

	public ContBancarBuilder setContSalariu(boolean contSalariu) {
		this.contSalariu = contSalariu;
		return this;
	}

	@Override
	public ContBancar build() {
		ContBancar cont = new ContBancar(detinator,suma, sumaBlocata,moneda,cardAtasat,internetBanking,contSalariu);
		return cont;
	}
	
	
	
}
