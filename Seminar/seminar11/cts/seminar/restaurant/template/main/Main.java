package cts.seminar.restaurant.template.main;

import cts.seminar.restaurant.template.clase.MasaLocala;
import cts.seminar.restaurant.template.clase.MasaRestaurant;
import cts.seminar.restaurant.template.clase.MasaRezervata;

public class Main {
	public static void main(String[] args) {
		MasaRestaurant masa = new MasaLocala(5);
		masa.ocupaMasa();
		MasaRestaurant masa2 = new MasaRezervata(6, "16:30");
		masa2.ocupaMasa();
	}
}
