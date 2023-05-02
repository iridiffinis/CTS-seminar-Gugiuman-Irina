package cts.strategy.program;

import cts.strategy.clase.Client;
import cts.strategy.clase.VerificareAmerican;
import cts.strategy.clase.VerificareUE;

public class Program {

	public static void main(String[] args) {
		Client client = new Client("Gigel", new VerificareAmerican());
		client.verificareDocumente();
		client.setModVerificare(new VerificareUE());
		client.verificareDocumente();

	}

}
