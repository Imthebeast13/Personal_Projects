package application;

public class DigitalStorage {
	
	private static final double CONSTBIT = 8;
	
	public double byteToBit (double valor) {
		return valor*CONSTBIT;
	}
	
	public double bitToByte (double valor) {
		return valor/CONSTBIT;
	}

}
