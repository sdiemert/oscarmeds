/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import model.*;
import view.OSCARMedsView;
/**
 *
 * @author simondiemert
 */
public class OSCARMedsController {
	private OSCARMedsView view;	
	private OSCARMedsModel model;	
	public OSCARMedsController(OSCARMedsView theView, OSCARMedsModel theModel){
		this.model = theModel;
		this.view = theView;
		this.view.addGoListener(new GoListener());
		this.view.addClearListener(new ClearListener());
		this.view.addTextFieldListener(new TextFieldDocumentListener());
	}
	public class GoListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0){
			try{
				Prescription script = new Prescription(
					view.getMedicationName(),
					view.getStrength(),
					view.getUnit(),
					view.getFreq(),
					view.getRoute()
				);	
				model.getPatient().addPerscription(script);	
				view.clearInputFields();
				view.setConsole("Added prescription: "+script.getPerscriptionString());
				System.out.println(script.getPerscriptionString());
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}

	public class TextFieldDocumentListener implements DocumentListener{
		@Override
		public void insertUpdate(DocumentEvent e) {
			view.setScriptField(view.getInputText());
		}
		@Override
		public void removeUpdate(DocumentEvent e) {
			view.setScriptField(view.getInputText());
		}
		@Override
		public void changedUpdate(DocumentEvent e) {
		    //Plain text components don't fire these events.
		}

	}
	
	public class TextFieldListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			try{
				System.out.println(arg0.paramString());	
				System.out.println(arg0.getActionCommand());	
				System.out.println(arg0.getSource());	
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}

	public class ClearListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			try{
				view.clearInputFields();
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}

}
