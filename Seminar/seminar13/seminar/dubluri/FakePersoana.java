package seminar.dubluri;

import seminar.clase.IPersoana;

public class FakePersoana implements IPersoana{

	private String sex;
	private int varsta;
	private boolean cnp;
	
	
	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setCnp(boolean cnp) {
		this.cnp = cnp;
	}

	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return this.sex;
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return this.varsta;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return true;
	}

}
