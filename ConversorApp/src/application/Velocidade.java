package application;

public class Velocidade {
	
	private static final double CSTKMH = 3.6;
	private static final double CSTMH = 1.609;
	private static final double CSTKNOT = 1.852;

	
	public double MsecToKmH (double velocidade) {
		return velocidade*CSTKMH;
	}
	
	public double KmHToMH (double velocidade) {
		return velocidade/CSTMH;
	}
	
	public double KmHToKnot (double velocidade) {
		return velocidade/CSTKNOT;
	}
	
	public double knotToKmH (double velocidade) {
		return velocidade*CSTKNOT;
	}

}
