package ex.strategy.clase;

public class PayPal implements ModPlata{

	@Override
	public void plateste(String numeClient, double sumaPlatita) {
		// TODO Auto-generated method stub
		System.out.println(numeClient +" plateste prin PayPal suma de "+sumaPlatita);
	}

}
