/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import java.util.ArrayList;

/**
 *
 * @author simondiemert
 */
public class Patient {
	private String name;
	private ArrayList<Prescription> scripts;
	
	public Patient(String name){
		this.name = name;
		this.scripts = new ArrayList<Prescription>();
	}
	
	public void addPerscription(Prescription script){
		this.scripts.add(script);
	}

	public String getPerscriptions(){
		String return_string = "";
		
		for(Prescription p: this.scripts){
			return_string += p.getPerscriptionString();
		}
		return return_string;
	}
	public String getPerscriptions(int i){
		return this.scripts.get(i).getPerscriptionString();
	}
}
