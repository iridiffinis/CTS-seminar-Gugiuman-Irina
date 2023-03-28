package cts.builder.main;

import cts.builder.Pacient;
import cts.builder.PacientBuilder;

public class Program {

	public static void main(String[] args) {
		PacientBuilder pacientBuilder = new PacientBuilder("Ion");
		Pacient pacient = pacientBuilder.setMicDeJunInclus(true).setPapuciDeCamera(true).build();
		Pacient pacientNou = new PacientBuilder("Maria").build();
		Pacient pacientNou2 = new PacientBuilder("Vasile").setMicDeJunInclus(true).setPatRabatabil(true).build();
		Pacient pacientNou3 = pacientBuilder.setPatRabatabil(true).build();
		
		System.out.println(pacient.toString());
		System.out.println(pacientNou.toString());
		System.out.println(pacientNou2.toString());
		System.out.println(pacientNou3.toString());

	}

}
