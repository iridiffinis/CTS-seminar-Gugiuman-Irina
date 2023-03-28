package cts.facade;

public class Program {

	public static void main(String[] args) {
		int codCamera = 6;
		if(Facade.verificareCamera(codCamera))
		{
			System.out.println("Camera este pregatita");
		}else {
			System.out.println("Varugam asteptati");
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.println(Facade.verificareDisponibilitateCamera(i));
		}

	}

}
