package cts.farmacie.command.clase;

import java.util.ArrayList;
import java.util.List;

public class Farmacist {
	private List<ICommand> comenzi = new ArrayList<ICommand>();
	
	public void preiaComenziMedicamente(ICommand command)
	{
		comenzi.add(command);
	}
	
	public void onoreazaComanda()
	{
		if(this.comenzi.size()!=0)
		{
			this.comenzi.get(0).executa();
			this.comenzi.remove(this.comenzi.get(0));
		}
	}
}
