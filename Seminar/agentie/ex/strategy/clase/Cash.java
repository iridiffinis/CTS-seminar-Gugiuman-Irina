package ex.strategy.clase;

public class Cash implements ModPlata{

	@Override
	public void plateste(String numeClient, double sumaPlatita) {
		// TODO Auto-generated method stub
		System.out.println(numeClient +" plateste cash suma de "+sumaPlatita);
	}
	
}
