package cts.seminar.restaurant.observer.clase;

public interface Subiect {
	void adaugaObserver(Observer observer);
	void stergereObserver(Observer observer);
	void notificareAbonati(String mesaj);
}
