package cts.spital.simple_factory;

public class Anestezis implements PersonalSpital{

	private String nume;
	
	
	public Anestezis(String nume) {
		this.nume = nume;
	}


	@Override
	public void descriere() {
		System.out.println("Anestezist: "+this.nume);
		
	}

}
