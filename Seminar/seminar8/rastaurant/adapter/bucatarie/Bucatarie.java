package rastaurant.adapter.bucatarie;

public class Bucatarie implements ISoftRestaurant{
	private String numebucatar;
	
	public Bucatarie(String numebucatar) {
		this.numebucatar=numebucatar;
	}
	
	@Override
	public void printezaNota(double totalSuma) {
		System.out.println("Restaurantul condus de "+this.numebucatar+" are o suma de plata de "+totalSuma);
		
	}

}
