package cts.spital.factory_method;

public class Infirmier implements PersonalSpital{
	private String nume;
	private int aniVechime;
	
	public Infirmier(String nume, int aniVechime) {
		super();
		this.nume = nume;
		this.aniVechime = aniVechime;
	}
	

	public Infirmier(String nume) {
		this.nume = nume;
		this.aniVechime = 0;
	}


	public int getAniVechime() {
		return aniVechime;
	}


	public void setAniVechime(int aniVechime) {
		this.aniVechime = aniVechime;
	}


	@Override
	public void descriere() {
		System.out.println("Infirmierul: "+this.nume+" are "+this.aniVechime+" ani vechime");
		
	}

}
