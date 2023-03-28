package cts.prototype.main;

import java.util.HashMap;
import java.util.Map;

import cts.prototype.IReteta;
import cts.prototype.Reteta;

public class Program {

	public static void main(String[] args) {
		Map<String, Float> solutii = new HashMap<>();
		solutii.put("soluitia1", (float) 20.0);
		solutii.put("soluitia2", (float) 30.0);
		solutii.put("soluitia3", (float) 10.0);
		
		IReteta prototype = new Reteta("Reteta",solutii,60);
		Reteta farmacie = (Reteta) prototype.copiaza();
		//incalcam dependencty invervion pentru a putea apela setterii
		farmacie.setNume("Reteta farmaciei");
		Reteta laborator = (Reteta) prototype.copiaza();
		laborator.setNume("Reteta laborator");
		
		System.out.println(farmacie.toString());
		System.out.println(laborator.toString());

	}

}
