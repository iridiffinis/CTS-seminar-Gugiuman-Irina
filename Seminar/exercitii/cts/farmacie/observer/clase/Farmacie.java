package cts.farmacie.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Farmacie implements Subject{
	private String nume;
	private List<Observer> clientiAbonati;
	
	public Farmacie(String nume) {
		super();
		this.nume = nume;
		this.clientiAbonati = new ArrayList<Observer>();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public List<Observer> getClientiAbonati() {
		return clientiAbonati;
	}

	public void setClientiAbonati(List<Observer> clientiAbonati) {
		this.clientiAbonati = clientiAbonati;
	}

	@Override
	public void adaugareObserver(Observer observer) {
		this.clientiAbonati.add(observer);
	}

	@Override
	public void stergereObserver(Observer observer) {
		this.clientiAbonati.remove(observer);
	}

	@Override
	public void notificareAbonati(String mesaj) {
		for (Observer observer : clientiAbonati) {
			observer.receptioneazaNotificare(mesaj);
		}
	}
	
	public void notificareOfertePret()
	{
		this.notificareAbonati("Farmacia "+this.nume+" are reduceri la produsele de protectie solara");
	}

}
