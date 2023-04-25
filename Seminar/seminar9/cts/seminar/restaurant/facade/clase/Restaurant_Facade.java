package cts.seminar.restaurant.facade.clase;

public class Restaurant_Facade {
	
	private MeseRestaurant meseRestaurant;
	private Ospatar ospatar;
	
	public Restaurant_Facade() {
		this.meseRestaurant = new MeseRestaurant();
		this.meseRestaurant.adaugaMasa(new Masa(true, 5, true));
		this.meseRestaurant.adaugaMasa(new Masa(false, 6, true));
		this.meseRestaurant.adaugaMasa(new Masa(true, 3,false));
		this.ospatar = new Ospatar();
		this.ospatar.debaraseazaMasa(5);
		this.ospatar.debaraseazaMasa(3);
	}
	
	public String verificareDisponibilitateMasa(int nrMasa)
	{
		if(meseRestaurant.esteMasaLibera(nrMasa))
		{
			if(ospatar.esteMasaDebarasata(nrMasa) && meseRestaurant.suntServeteleNoi(nrMasa))
			{
				return "Masa este libera si puteti lua loc";
			}
			else {
				return "Masa este libera, asteptati sa fie debarasata";
			}
		}else {
			return "Masa nu este disponibila momentan";
		}
	}
	
}
