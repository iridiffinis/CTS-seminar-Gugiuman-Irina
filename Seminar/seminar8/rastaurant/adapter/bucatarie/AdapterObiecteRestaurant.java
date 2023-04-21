package rastaurant.adapter.bucatarie;

import rastaurant.adapter.bar.ISoftBar;

public class AdapterObiecteRestaurant implements ISoftRestaurant{

	private ISoftBar bar;
	
	
	
	public AdapterObiecteRestaurant(ISoftBar bar) {
		super();
		this.bar = bar;
	}



	@Override
	public void printezaNota(double totalSuma) {
		// TODO Auto-generated method stub
		this.bar.printeazaNotaBauturi(totalSuma);
	}

}
