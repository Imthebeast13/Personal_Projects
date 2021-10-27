package application;

public class Massa {
	
	private static final double CSTLBS = 2.205;
	private static final double CSTOUNCE = 35.274;
	private static final double CSTLBS_OUNCE = 16;

	public double lbsToKg (double massa) {
		
		return massa/CSTLBS;
	}
	
	public double kgTolbs (double massa) {
		
		return massa*CSTLBS;
	}
	
	public double ounceTokg (double massa) {
		
		return massa/CSTOUNCE;
	}
		
	public double kgToOunce (double massa) {
			
		return massa*CSTOUNCE;
	}

	public double lbsToOunce(double massa) {
		
		return massa*CSTLBS_OUNCE;
	}

	public double ounceToLbs(double massa) {
		
		return massa/CSTLBS_OUNCE;
	}

}
