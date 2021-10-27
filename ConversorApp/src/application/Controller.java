package application;

import javafx.event.ActionEvent;

public class Controller {
	
	private Area area = new Area();
	private Massa massa = new Massa();
	private Distancia distancia = new Distancia();
	private DigitalStorage ds = new DigitalStorage(); 
	private Pressao p = new Pressao();
	private Temperatura t = new Temperatura();
	private Velocidade v = new Velocidade();
	private Volume vol = new Volume();
	
	public double massaEvent (String[] params) {
		
		double valor = Double.parseDouble(params[2]);
		
		if(params[0].contentEquals(params[1])) {
			return valor;
		}
		
		//kg->lbs
		if((params[0] == "kg") && (params[1] == "lbs")) {
			return massa.kgTolbs(valor);
		}
		
		//lbs->kg
		if((params[0] == "lbs") && (params[1] == "kg")) {
			return massa.lbsToKg(valor);
		}
		
		//kg->ounce
		if((params[0] == "kg") && (params[1] == "ounce")) {
			return massa.kgToOunce(valor);
		}
		
		//ounce->kg
		if((params[0] == "ounce") && (params[1] == "kg")) {
			return massa.ounceTokg(valor);
		}
		
		//lbs->ounce
		if((params[0] == "lbs") && (params[1] == "ounce")) {
			return massa.lbsToOunce(valor);
		}
		
		//ounce->lbs
		if((params[0] == "ounce") && (params[1] == "lbs")) {
			return massa.ounceToLbs(valor);
		}
		
		return -1.0;
		
	
	}
	
	public double areaEvent (String[] params) {
		

		double valor = Double.parseDouble(params[2]);
		
		if(params[0].contentEquals(params[1])) {
			return valor;
		}
		
		//m2->ha
		if((params[0] == "m2") && (params[1] == "ha")) {
			return area.m2ToHa(valor);
		}
		
		//ha->m2
		if((params[0] == "ha") && (params[1] == "m2")) {
			return area.haTom2(valor);
		}
		
		//m2->yard
		if((params[0] == "m2") && (params[1] == "yard2")) {
			return area.m2ToYard2(valor);
		}
		
		//yard->m2
		if((params[0] == "yard2") && (params[1] == "m2")) {
			return area.Yard2Tom2(valor);
		}
		
		//ac->m2
		if((params[0] == "ac") && (params[1] == "m2")) {
			return area.AcTom2(valor);
		}
		
		//m2->ac
		if((params[0] == "m2") && (params[1] == "ac")) {
			return area.m2ToAc(valor);
		}
		
		//ac->yard2
		if((params[0] == "ac") && (params[1] == "yard2")) {
			return area.AcToYard2(valor);
		}
		
		//yard2->ac
		if((params[0] == "yard2") && (params[1] == "ac")) {
			return area.Yard2ToAc(valor);
		}
		
		return -1.0;	
	}
	
	public double distanciaEvent (String[] params) {

		double valor = Double.parseDouble(params[2]);
		
		if(params[0].contentEquals(params[1])) {
			return valor;
		}
		
		//km->mi
		if((params[0] == "km") && (params[1] == "mi")) {
			return distancia.kmToMile(valor);
		}
		
		//mi->km
		if((params[0] == "mi") && (params[1] == "km")) {
			return distancia.mileToKm(valor);
		}
		
		//m->ft
		if((params[0] == "m") && (params[1] == "ft")) {
			return distancia.mToFoot(valor);
		}
		
		//ft->m
		if((params[0] == "ft") && (params[1] == "m")) {
			return distancia.footTom(valor);
		}
		
		//m->yd
		if((params[0] == "m") && (params[1] == "yd")) {
			return distancia.mToYard(valor);
		}
		
		//yd->m
		if((params[0] == "yd") && (params[1] == "m")) {
			return distancia.yardToM(valor);
		}
		
		return -1.0;	
		
	}
	
	public double pressaoEvent (String[] params) {
		
		double valor = Double.parseDouble(params[2]);
		
		if(params[0].contentEquals(params[1])) {
			return valor;
		}
		//bar->pascal
		if((params[0] == "bar") && (params[1] == "pascal")) {
			return p.barToPascal(valor);	
		}
		
		//bar->psi
		if((params[0] == "bar") && (params[1] == "psi")) {
			return p.barToPSI(valor);
		}
		
		//pascal->bar
		if((params[0] == "pascal") && (params[1] == "bar")) {
			return p.PascalToBar(valor);
		}
				
		//pascal->psi
		if((params[0] == "pascal") && (params[1] == "psi")) {
			return p.PascalToPSI(valor);
		}
		//psi->bar
		if((params[0] == "psi") && (params[1] == "bar")) {
			return p.PSIToBar(valor);
		}
		
		//psi->pascal
		if((params[0] == "psi") && (params[1] == "pascal")) {
			return p.PSIToPascal(valor);
		}
		
		return -1.0;
	}
	
	public double digitalStorageEvent (String[] params) {
		
		double valor = Double.parseDouble(params[2]);
		
		if(params[0].contentEquals(params[1])) {
			return valor;
		}
		//bit->byte
		if((params[0] == "bit") && (params[1] == "byte")) {
			return ds.bitToByte(valor);		
		}
		
		//byte->bit
		if((params[0] == "byte") && (params[1] == "bit")) {
			return ds.byteToBit(valor);
		}
		
		return -1.0;
		
		
	}
	
	public double temperaturaEvent (String[] params) {
		
		double valor = Double.parseDouble(params[2]);
		
		if(params[0].contentEquals(params[1])) {
			return valor;
		}
		
		//C->F
		if((params[0] == "Cº") && (params[1] == "Fº")) {
			return t.celsiusToFahrenheit(valor);
		}
		
		//C->K
		if((params[0] == "Cº") && (params[1] == "Kº")) {
			return t.celsiusToKelvin(valor);
		}
		
		//F->K
		if((params[0] == "Fº") && (params[1] == "Kº")) {
			return t.FahrenheitToKelvin(valor);
		}

		return -1.0;
	}
	
	public double velocidadeEvent (String[] params) {
		
		double valor = Double.parseDouble(params[2]);
		
		if(params[0].contentEquals(params[1])) {
			return valor;
		}
		
		//C->F
		if((params[0] == "km/h") && (params[1] == "mi/h")) {
			return v.KmHToMH(valor);
		}
		
		if((params[0] == "m/s") && (params[1] == "km/h")) {
			return v.MsecToKmH(valor);
		}
		
		//C->K
		if((params[0] == "km/h") && (params[1] == "knot")) {
			return v.KmHToKnot(valor);
		}
		
		//C->K
		if((params[0] == "knot") && (params[1] == "km/h")) {
			return v.knotToKmH(valor);
		}
		
		return -1.0;
	}
	
	public double volumeEvent (String[] params) {
		
		double valor = Double.parseDouble(params[2]);
		
		if(params[0].contentEquals(params[1])) {
			return valor;
		}
		
		//L->Gal
		if((params[0] == "L") && (params[1] == "Gal")) {
			return vol.literToGallon(valor);
		}
		
		//Gal->L
		if((params[0] == "Gal") && (params[1] == "L")) {
			return vol.gallonToLiter(valor);
		}
		return -1.0;
	}

}
