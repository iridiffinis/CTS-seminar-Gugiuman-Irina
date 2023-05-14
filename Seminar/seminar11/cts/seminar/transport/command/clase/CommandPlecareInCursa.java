package cts.seminar.transport.command.clase;

public class CommandPlecareInCursa implements ICommand{
	private int nrLinie;
	private Automobil automobil;
	
	public CommandPlecareInCursa(int nrLinie, Automobil automobil) {
		super();
		this.nrLinie = nrLinie;
		this.automobil = automobil;
	}


	@Override
	public void executa() {
		// TODO Auto-generated method stub
		automobil.plecareInCursa(this.nrLinie);
	}
	
}
