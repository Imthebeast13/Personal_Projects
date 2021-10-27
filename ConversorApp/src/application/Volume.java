package application;

public class Volume {
	
private static final double CONSTGALLON = 3.785;
	
	public double literToGallon (double valor) {
		return valor/CONSTGALLON;
	}

	public double gallonToLiter (double valor) {
		return valor*CONSTGALLON;
	}

}
