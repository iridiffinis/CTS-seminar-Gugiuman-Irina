package rastaurant.adapter.bucatarie;

import rastaurant.adapter.bar.SoftBar;

public class AdapterClaseRestaurant extends SoftBar implements ISoftRestaurant{

	
	
	public AdapterClaseRestaurant(String denumire) {
		super(denumire);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void printezaNota(double totalSuma) {
		// TODO Auto-generated method stub
		super.printeazaNotaBauturi(totalSuma);
	}
	

}
