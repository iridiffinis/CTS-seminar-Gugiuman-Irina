package cts.flyweight.clase;

public class Camera implements ICamera{
	private int codAranjare;
	private int nrProsoape;
	private int nrCearceafuri;
	private int nrPerne;
	private int nrUmerase;
	
	@Override
	public void tiparire(Rezervare rezervare) {
		// TODO Auto-generated method stub
		System.out.println(this.toString()+" "+rezervare.toString());
	}

	public Camera(int codAranjare, int nrProsoape, int nrCearceafuri, int nrPerne, int nrUmerase) {
		super();
		this.codAranjare = codAranjare;
		this.nrProsoape = nrProsoape;
		this.nrCearceafuri = nrCearceafuri;
		this.nrPerne = nrPerne;
		this.nrUmerase = nrUmerase;
	}

	@Override
	public String toString() {
		return "Camera [codAranjare=" + codAranjare + ", nrProsoape=" + nrProsoape + ", nrCearceafuri=" + nrCearceafuri
				+ ", nrPerne=" + nrPerne + ", nrUmerase=" + nrUmerase + "]";
	}

}
