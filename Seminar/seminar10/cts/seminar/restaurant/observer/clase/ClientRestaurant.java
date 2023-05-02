package cts.seminar.restaurant.observer.clase;

public class ClientRestaurant implements Observer{
	@Override
	public void receptioneazaNotificare(String mesaj) {
		System.out.println(this.nume+", ai primit urmatorul mesaj: "+mesaj);
		
	}

	private String nume;

	public ClientRestaurant(String nume) {
		super();
		this.nume = nume;
	}
	
	
}
