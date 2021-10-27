package application;

public class Temperatura {
	
	private static final int CONSTTEMP = 32;
	private static final int CONSTKELVIN = 32;

	
	public double celsiusToFahrenheit (double temp) {
		return (temp*9/5)+CONSTTEMP;
	}
	
	public double celsiusToKelvin (double temp) {
		return temp + CONSTKELVIN;
	}
	
	public double FahrenheitToKelvin (double temp) {
		return (temp-CONSTTEMP)*5/9 + CONSTKELVIN;
	}

}
