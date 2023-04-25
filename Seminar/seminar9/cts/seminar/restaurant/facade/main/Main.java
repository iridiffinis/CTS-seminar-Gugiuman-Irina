package cts.seminar.restaurant.facade.main;

import cts.seminar.restaurant.facade.clase.Restaurant_Facade;

public class Main {

	public static void main(String[] args) {
		Restaurant_Facade restaurant = new Restaurant_Facade();
		System.out.println(restaurant.verificareDisponibilitateMasa(5));
		System.out.println(restaurant.verificareDisponibilitateMasa(3));
		System.out.println(restaurant.verificareDisponibilitateMasa(6));

	}

}
