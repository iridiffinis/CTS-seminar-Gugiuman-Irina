package cts.seminar.restaurant.state.main;

import cts.seminar.restaurant.state.clase.Masa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masa masa = new Masa(15);
		masa.elibereazaMasa();
		masa.ocupaMasa();
		masa.rezervaMasa();
		masa.ridicaRezervare();
		masa.ocupaMasa();
		masa.elibereazaMasa();
		masa.ocupaMasa();
	}

}
