package application;

public class Pressao {
	
	private static final double CONSTPSI = 14.504;
	private static final double CONSTPASCAL = 6895;

	
	public double barToPSI (double pressao) {
		return pressao*CONSTPSI;
	}
	
	public double PSIToBar (double pressao) {
		return pressao/CONSTPSI;
	}
	
	public double barToPascal (double pressao) {
		return pressao*100000;
	}
	
	public double PascalToBar (double pressao) {
		return pressao/100000;
	}
	
	public double PSIToPascal (double pressao) {
		return pressao*CONSTPASCAL;
	}
	
	public double PascalToPSI (double pressao) {
		return pressao/CONSTPASCAL;
	}
	
	

}
