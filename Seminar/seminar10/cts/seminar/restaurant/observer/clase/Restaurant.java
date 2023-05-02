package cts.seminar.restaurant.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subiect{

	private String nume;
	private List<Observer> clientiAbonati;
	
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

	public Restaurant(String nume) {
		super();
		this.nume = nume;
		this.clientiAbonati = new ArrayList<Observer>();
	}

	@Override
	public void adaugaObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.clientiAbonati.add(observer);
	}

	@Override
	public void stergereObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.clientiAbonati.remove(observer);
	}

	@Override
	public void notificareAbonati(String mesaj) {
		// TODO Auto-generated method stub
		for (Observer observer : clientiAbonati) {
			observer.receptioneazaNotificare(mesaj);
		}
	}
	
	public void notificareOfertaPret()
	{
		this.notificareAbonati(this.nume+": Sunt reduceri de pret la friptura");
	}
	public void notificaSchimbareMeniu()
	{
		this.notificareAbonati(this.nume+" are produse noi la categoria fructe de mare");
	}

}
