package cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.clase.Aplicant;
import cts.clase.reader.ReaderAngajat;
import cts.clase.reader.ReaderAplicant;


public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			ReaderAplicant reader = new ReaderAngajat();
			listaAngajati = reader.readAplicants("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
