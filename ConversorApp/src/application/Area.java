package application;

public class Area {
	
	private static final double CSTHA = 10000;
	private static final double CSTYARD = 1.196;
	private static final double CSTACRE = 4047;
	private static final double CSTAcToYard = 4840;
	
	public double m2ToHa (double area) {
		return area/CSTHA;
	}
	
	public double haTom2 (double area) {
		return area*CSTHA;
	}
	
	public double m2ToYard2 (double area) {
		return area*CSTHA;
	}
	
	public double Yard2Tom2 (double area) {
		return area/CSTYARD;
	}
	
	public double m2ToAc (double area) {
		return area/CSTACRE;
	}
	
	public double AcTom2 (double area) {
		return area/CSTACRE;
	}
	
	public double AcToYard2 (double area) {
		return area*CSTAcToYard;
	}
	
	public double Yard2ToAc (double area) {
		return area/CSTAcToYard;
	}

}
