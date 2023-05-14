package cts.seminar.transport.command.clase;

public class Autobuz implements Automobil{

	private int numar;
	
	public Autobuz(int numar) {
		super();
		this.numar = numar;
	}



	@Override
	public void plecareInCursa(int nrLinie) {
		// TODO Auto-generated method stub
		System.out.println("Autobuzul numarul "+this.numar+" pleaca in cursa pe linia "+nrLinie);
	}
	
}
