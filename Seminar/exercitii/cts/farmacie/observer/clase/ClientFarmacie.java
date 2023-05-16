package cts.farmacie.observer.clase;

public class ClientFarmacie implements Observer{
	private String nume;
	
	public ClientFarmacie(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void receptioneazaNotificare(String mesaj) {
		System.out.println(this.nume+", ai o notificare noua: "+mesaj);
	}

}
