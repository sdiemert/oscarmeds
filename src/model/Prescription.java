/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author simondiemert
 */
public class Prescription {
	private String medicationName;
	private int strength = -1;
	private String unit;
	private String freq;
	private String route;
	
	public Prescription(String name, int strength, String unit, String freq, String route){
		this.medicationName = name;
		this.strength = strength;
		this.unit = unit;
		this.route = route;
		this.freq = freq;
	}
	public Prescription(){

	}
	
	public String getMedicationName(){
		return this.medicationName;
	}
	public int getStrength(){
		return this.strength;
	}
	public String getUnit(){
		return this.unit;
	}
	public String getFreq(){
		return this.freq;
	}
	public String getRoute(){
		return this.route;
	}
	public void setMedicationName(String name){
		this.medicationName =name;
	}
	public void setStrength(int value){
		this.strength = value;
	}
	public void setRoute(String value){
		this.route = value;
	}
	public void setFreq(String value){
		this.freq = value;
	}
	public void setUnit(String value){
		this.unit = value;
	}
	public String getPerscriptionString(){
		String return_s = "";
		if (this.medicationName != null){
			return_s += this.medicationName;
			return_s += " ";
		}
		if (this.strength != -1){
			return_s += Integer.toString(this.strength);
			return_s += " ";
		}
		if (this.unit != null){
			return_s += this.unit;
			return_s += " ";
		}
		if (this.route != null){
			return_s += this.route;
			return_s += " ";
		}
		if (this.freq != null){
			return_s += this.freq;
		}
		return return_s;
	}

}
