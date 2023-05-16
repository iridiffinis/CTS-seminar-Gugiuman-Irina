package cts.farmacie.state.main;

import cts.farmacie.state.clase.Reteta;

public class Main {
	public static void main(String[] args) {
		Reteta reteta = new Reteta("as12");
		
		reteta.achizitionareReteta();
		reteta.emitereReteta();
		reteta.solicitareReteta();
		reteta.achizitionareReteta();
		reteta.emitereReteta();
		reteta.solicitareReteta();
		reteta.solicitareReteta();
		reteta.achizitionareReteta();
	}
}
