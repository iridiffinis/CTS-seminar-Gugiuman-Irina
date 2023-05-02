package ex.flyweight.clase;

import java.util.HashMap;

public class FabricaPachete {
	private HashMap<Integer, IPachetTuristic> pacheteTuristice;
	
	public FabricaPachete() {
		pacheteTuristice = new HashMap<>();
	}
	
	public int getNrPachete()
	{
		return pacheteTuristice.size();
	}
	
	public IPachetTuristic getPachetTuristic(int codPachet)
	{
		IPachetTuristic pachet = pacheteTuristice.get(codPachet);
		if(pachet == null)
		{
			pachet = new PachetTuristic(codPachet, "Hotel", "OrasTuristic", true);
			pacheteTuristice.put(codPachet, pachet);
		}
		return pachet;
	}
}
