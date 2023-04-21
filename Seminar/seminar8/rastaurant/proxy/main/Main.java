package rastaurant.proxy.main;

import rastaurant.proxy.clase.IRestaurant;
import rastaurant.proxy.clase.ProxyRestaurant;
import rastaurant.proxy.clase.Restaurant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IRestaurant restaurant = new Restaurant("Hush");
		restaurant.rezervareMasa(2);
		System.out.println();
		
		IRestaurant proxy = new ProxyRestaurant(restaurant);
		proxy.rezervareMasa(2);
		proxy.rezervareMasa(4);
		System.out.println();
		

	}

}
