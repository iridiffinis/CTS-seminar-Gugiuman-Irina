package cts.seminar.restaurant.chain_of_responsibility.clase;

public class NotificareEmail extends Notificator{

	@Override
	public void notificaClient(Client client, String mesaj) {
		if(client.getAdresaEmail()!=null)
			System.out.println("Clientul "+client.getNume()+" primeste Email cu mesajul: "+mesaj);
		else {
			if(super.getSuccesor()!=null)
				super.getSuccesor().notificaClient(client, mesaj);
			else {
				System.out.println("Clientul "+client.getNume()+" nu poate fi notificat");
			}
		}
		
		
	}

}
