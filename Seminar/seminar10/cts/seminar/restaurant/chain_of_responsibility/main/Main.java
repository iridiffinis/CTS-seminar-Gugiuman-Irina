package cts.seminar.restaurant.chain_of_responsibility.main;

import cts.seminar.restaurant.chain_of_responsibility.clase.Client;
import cts.seminar.restaurant.chain_of_responsibility.clase.NotificareEmail;
import cts.seminar.restaurant.chain_of_responsibility.clase.NotificareTelefon;
import cts.seminar.restaurant.chain_of_responsibility.clase.Notificator;
import cts.seminar.restaurant.chain_of_responsibility.clase.NotificatorManager;

public class Main {

	public static void main(String[] args) {
		Notificator notificatorTelefon = new NotificareTelefon();
		Notificator notificatorEmail = new NotificareEmail();
		Notificator notificatorManager = new NotificatorManager();
		
//		notificatorTelefon.setSuccesor(notificatorEmail);
//		notificatorEmail.setSuccesor(notificatorManager);
		
		notificatorEmail.setSuccesor(notificatorTelefon);
		notificatorTelefon.setSuccesor(notificatorManager);
		
		Client client1 = new Client("Ana","mailana@mail.com","0722");
		Client client2 = new Client("Maria","mailmaria@mail.com",null);
		Client client3 = new Client("Ion",null,"07229999");
		Client client4 = new Client("Vlad",null,null);
		
//		notificatorTelefon.notificaClient(client1, "mesaj");
//		notificatorTelefon.notificaClient(client2, "mesaj");
//		notificatorTelefon.notificaClient(client3, "mesaj");
//		notificatorTelefon.notificaClient(client4, "mesaj");
		
		notificatorEmail.notificaClient(client1, "mesaj");
		notificatorEmail.notificaClient(client2, "mesaj");
		notificatorEmail.notificaClient(client3, "mesaj");
		notificatorEmail.notificaClient(client4, "mesaj");
	}

}
