package cts.main;

import cts.singleton.register.Firma;
import cts.singleton.register.Registru;

public class Main {

	public static void main(String[] args) {
		
		Registru registru =new Registru();
		Registru registru2=new Registru();
		
		Firma firma1 =registru.getFirma("SC nume1 SRL"); //=>returneaza o firma
		Firma firma2 =registru.getFirma("SC nume2 SRL");
		Firma firma3 =registru2.getFirma("SC nume1 SRL");
		
		//Firma firma4 = new Firma("SC nume1 SRL",0); 
		//fiindca constructorul din firma este protected si main este in alt pachet, nu mai are acces la el
		
		firma1.angajeaza();
		firma2.angajeaza();
		firma3.angajeaza();
		
		System.out.println(firma1.toString());
		System.out.println(firma2.toString());
		System.out.println(firma3.toString());

	}

}
