package cts.seminar.transport.command.main;

import cts.seminar.transport.command.clase.Autobuz;
import cts.seminar.transport.command.clase.Automobil;
import cts.seminar.transport.command.clase.CommandPlecareInCursa;
import cts.seminar.transport.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		ManagerComenzi managerComenzi = new ManagerComenzi();
		Automobil autobuz = new Autobuz(13);
		managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(1)));
		managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));
		managerComenzi.invocaComanda(new CommandPlecareInCursa(12, new Autobuz(3)));
		managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));
		
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(23)));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
	}

}
