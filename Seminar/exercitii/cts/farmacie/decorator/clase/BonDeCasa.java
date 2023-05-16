package cts.farmacie.decorator.clase;

public class BonDeCasa implements IBonDeCasa{
	private String dataBon;
	
	public BonDeCasa(String dataBon) {
		super();
		this.dataBon = dataBon;
	}

	@Override
	public void printareBon(double totalPlata) {
		// TODO Auto-generated method stub
		System.out.println("Total plata: "+totalPlata+", data: "+this.dataBon);
	}

}
