package cts.farmacie.proxy.clase;

public class Farmacie implements IFarmacie{
	private String denumire;

	public Farmacie(String denumire) {
		super();
		this.denumire = denumire;
	}

	@Override
	public void vanzareMedicamente(Boolean reteta) {
		// TODO Auto-generated method stub
		if(reteta)
		{
			System.out.println("Clientul a cumparat pe baza de reteta de la farmacia "+this.denumire);
		}
		else {
			System.out.println("Clientul a cumparat fara reteta de la farmacia "+this.denumire);
		}
	}

}
