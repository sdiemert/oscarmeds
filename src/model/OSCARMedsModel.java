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
public class OSCARMedsModel {
	private ArrayList<Prescription> perscriptions;
	private String text;
	private int currentPerscription;
	private Patient patient;

	public OSCARMedsModel(){
		
	}
	public OSCARMedsModel(Patient p){
		this.patient = p;
	}

	public OSCARMedsModel(String text, ArrayList<Prescription> scripts){
		this.perscriptions = scripts;
		this.currentPerscription = 0;
		this.text = text;
	}
	public String getText(){
		return this.text;
	}
	public Prescription getCurrentPerscription(){
		return this.perscriptions.get(currentPerscription);
	}
	public void setPatient(String name){
		this.patient = new Patient(name);
	}
	public Patient getPatient(){
		return this.patient;
	}
}
