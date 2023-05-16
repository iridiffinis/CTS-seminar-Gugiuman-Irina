package cts.farmacie.command.clase;

public class ComandaMedicamente implements ICommand{
	private String comanda;
	private PersonalFarmacie ajutor;
	
	public ComandaMedicamente(String comanda, PersonalFarmacie ajutor) {
		super();
		this.comanda = comanda;
		this.ajutor = ajutor;
	}

	@Override
	public void executa() {
		ajutor.aducereMedicamente(this.comanda);
	}

}
