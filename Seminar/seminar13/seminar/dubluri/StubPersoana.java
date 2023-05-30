package seminar.dubluri;

import seminar.clase.IPersoana;

public class StubPersoana implements IPersoana{
	
	
	
	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return "M";
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return 23;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
