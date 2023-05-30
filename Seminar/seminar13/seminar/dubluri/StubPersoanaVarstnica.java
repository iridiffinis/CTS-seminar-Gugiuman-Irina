package seminar.dubluri;

import seminar.clase.IPersoana;

public class StubPersoanaVarstnica implements IPersoana{

	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return "F";
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return 75;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return true;
	}

}
