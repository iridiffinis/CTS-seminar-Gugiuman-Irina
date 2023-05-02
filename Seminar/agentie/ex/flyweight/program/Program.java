package ex.flyweight.program;

import ex.flyweight.clase.FabricaPachete;
import ex.flyweight.clase.Optionale;
import ex.flyweight.clase.PachetTuristic;

public class Program {

	public static void main(String[] args) {
		FabricaPachete fabricaPachete = new FabricaPachete();
		Optionale optional1 = new Optionale(true, 3);
		Optionale optional2 = new Optionale(false, 3);
		Optionale optional3 = new Optionale(true, 1);
		Optionale optional4 = new Optionale(true, 5);
		
		PachetTuristic pachet = (PachetTuristic) fabricaPachete.getPachetTuristic(1);
		pachet.descriePachet(optional1);
		fabricaPachete.getPachetTuristic(2).descriePachet(optional2);
		optional2.setNrExcursii(40);
		fabricaPachete.getPachetTuristic(2).descriePachet(optional2);
		fabricaPachete.getPachetTuristic(2).descriePachet(optional3);
		fabricaPachete.getPachetTuristic(1).descriePachet(optional4);
		
		System.out.println(fabricaPachete.getNrPachete());

	}

}
