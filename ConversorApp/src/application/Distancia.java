package application;

public class Distancia {
	
	private static final double CSTMILHA = 1.609;
	private static final double CSTYARD = 1.094;
	private static final double CSTFOOT = 3.281;
	
	public double kmToMile (double dist) {
		return dist/CSTMILHA;
	}
	
	public double mileToKm (double dist) {	
		return dist*CSTMILHA;
	}
	
	public double mToYard (double dist) {
		return dist*CSTYARD;
	}
	
	public double yardToM (double dist) {
		return dist/CSTYARD;
	}
	
	public double mToFoot (double dist) {
		return dist*CSTFOOT;
	}
	
	public double footTom (double dist) {
		return dist/CSTFOOT;
	}
}
