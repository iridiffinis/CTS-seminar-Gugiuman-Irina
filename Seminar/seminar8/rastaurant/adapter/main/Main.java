package rastaurant.adapter.main;

import rastaurant.adapter.bar.ISoftBar;
import rastaurant.adapter.bar.SoftBar;
import rastaurant.adapter.bucatarie.AdapterObiecteRestaurant;
import rastaurant.adapter.bucatarie.AdapterClaseRestaurant;
import rastaurant.adapter.bucatarie.Bucatarie;
import rastaurant.adapter.bucatarie.ISoftRestaurant;

public class Main {
	
	public static void imprimare(ISoftRestaurant restaurant, double notaPlata)
	{
		restaurant.printezaNota(notaPlata);
	}
	
	public static void main(String[] args) {
		ISoftBar bar = new SoftBar("Alcadido");
		bar.printeazaNotaBauturi(240);
		
		ISoftRestaurant bucatarie = new Bucatarie("George");
		bucatarie.printezaNota(300);
		
		//imprimare(bar,241.99);
		imprimare(bucatarie,300);
		
		AdapterClaseRestaurant adapter = new AdapterClaseRestaurant("Hugo");
		imprimare(adapter,513.99);
		
		AdapterObiecteRestaurant adapterObiecte = new AdapterObiecteRestaurant(bar);
		imprimare(adapterObiecte, 150);
	}
}
