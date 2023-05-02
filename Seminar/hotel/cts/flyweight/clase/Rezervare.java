package cts.flyweight.clase;

public class Rezervare {
	private String numeClient;
	private int numarCamera;
	
	public Rezervare(String numeClient, int numarCamera) {
		super();
		this.numeClient = numeClient;
		this.numarCamera = numarCamera;
	}

	@Override
	public String toString() {
		return "Rezervare [numeClient=" + numeClient + ", numarCamera=" + numarCamera + "]";
	}
	
	
}
