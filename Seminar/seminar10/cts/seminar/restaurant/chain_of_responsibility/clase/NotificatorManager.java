package cts.seminar.restaurant.chain_of_responsibility.clase;

public class NotificatorManager extends Notificator{

	@Override
	public void notificaClient(Client client, String mesaj) {
		// TODO Auto-generated method stub
		System.out.println("Pentru clientul "+client.getNume()+" nu avem date de contact");
	}

}
