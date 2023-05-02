package ex.strategy.clase;

public class Card implements ModPlata{

	@Override
	public void plateste(String numeClient, double sumaPlatita) {
		// TODO Auto-generated method stub
		System.out.println(numeClient +" plateste cu cardul suma de "+sumaPlatita);
	}

}
