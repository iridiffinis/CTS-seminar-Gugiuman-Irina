package rastaurant.proxy.clase;

public class Restaurant implements IRestaurant{
	private String denumire;
	
	public Restaurant(String denumire) {
		super();
		this.denumire = denumire;
	}

	@Override
	public void rezervareMasa(int numarPersoane) {
		// TODO Auto-generated method stub
		System.out.println("Masa a fost rezervata pentru "+numarPersoane+" persoane la restaurantul "+this.denumire);
	}

}
