package cts.facade;

public class Facade {
	public static boolean verificareCamera(int codCamera) {
		CamereLibere libere = new CamereLibere();
		if(libere.verificareCameraLibera(codCamera))
		{
			Menajera menajera = new Menajera();
			if(menajera.esteCameraCurata(codCamera) && menajera.areProsoapeCurate(codCamera))
			{
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public static String verificareDisponibilitateCamera(int codCamera) {
		CamereLibere libere = new CamereLibere();
		if(libere.verificareCameraLibera(codCamera))
		{
			Menajera menajera = new Menajera();
			if(menajera.esteCameraCurata(codCamera) && menajera.areProsoapeCurate(codCamera))
			{
				return "Camera este gata";
			}else {
				return "Asteptati pana se face curatenie";
			}
		}else {
			return "Asteptati pana se elibereaza";
		}
	}
}
