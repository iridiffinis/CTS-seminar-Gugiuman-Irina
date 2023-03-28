package cts.prototype;

public class Program {

	public static void main(String[] args) {
		PrototypePersoana persoana = new Persoana(15.2,2.4,10.9);
		PrototypePersoana persoana2 = new Persoana(12.4,1.96,14.32);
		
		PrototypePersoana copiePersoana = persoana.copiaza();
		PrototypePersoana copiePersoana2 = persoana2.copiaza();
		
		System.out.println("P1: "+persoana);
		System.out.println("P2: "+persoana2);
		System.out.println("C_P1: "+copiePersoana);
		System.out.println("C_P2: "+copiePersoana2);
		
	}

}
