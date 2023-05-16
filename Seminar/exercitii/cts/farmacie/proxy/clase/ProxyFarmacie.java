package cts.farmacie.proxy.clase;

public class ProxyFarmacie implements IFarmacie{
	private IFarmacie farmacie;

	public ProxyFarmacie(IFarmacie farmacie) {
		super();
		this.farmacie = farmacie;
	}

	@Override
	public void vanzareMedicamente(Boolean reteta) {
		if(reteta)
		{
			this.farmacie.vanzareMedicamente(reteta);
		}
		else {
			System.out.println("Se vand medicamente doar pe baza de reteta");
		}
	}

}
