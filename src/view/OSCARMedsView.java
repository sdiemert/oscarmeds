/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;
import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.*;
import javax.swing.event.DocumentListener;
/**
 *
 * @author simondiemert
 */
public class OSCARMedsView extends JFrame{
	private JTextArea textField = new JTextArea("text");
	private JTextField medicationNameField = new JTextField(15);
	private JTextField strengthField = new JTextField(15);
	private JTextField unitField = new JTextField(15);
	private JTextField freqField = new JTextField(15);
	private JTextField routeField = new JTextField(15);
	private JTextField scriptField = new JTextField(15);
	private JLabel medicationNameLabel = new JLabel("Name: ");
	private JLabel strengthLabel = new JLabel("Strength: ");
	private JLabel unitLabel = new JLabel("Unit: ");
	private JLabel routeLabel = new JLabel("Route: ");
	private JLabel freqLabel = new JLabel("Freq: ");
	private JLabel scriptLabel = new JLabel("Script: ");
	private JButton goButton = new JButton("Prescribe");
	private JButton clearButton = new JButton("Clear");
	private JTextField console = new JTextField(50);

	public OSCARMedsView(){
		JPanel scriptPanel = new JPanel(new GridBagLayout());
		JPanel textPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 300);
		
		console.setEditable(false);
		bottomPanel.add(console);
		
		textField.setPreferredSize(new Dimension(500,200));
		textField.setLineWrap(true);
		textField.setEditable(false);
		
		textPanel.add(textField);

		
		GridBagConstraints c = new GridBagConstraints();

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		scriptPanel.add(medicationNameLabel,c);
		
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 0;
		scriptPanel.add(medicationNameField,c);


		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		scriptPanel.add(strengthLabel,c );
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 1;
		scriptPanel.add(strengthField,c);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 2;
		scriptPanel.add(unitLabel,c);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 2;
		
		scriptPanel.add(unitField,c);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 4;
		scriptPanel.add(routeLabel,c);
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 4;
		scriptPanel.add(routeField,c);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 3;
		scriptPanel.add(freqLabel,c);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 3;
		scriptPanel.add(freqField,c);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 5;
		scriptPanel.add(scriptLabel,c);

		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 5;
		scriptField.setEditable(false);
		scriptPanel.add(scriptField,c);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 6;
		scriptPanel.add(goButton, c);
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 6;
		scriptPanel.add(clearButton, c);
		
		this.setLayout(new FlowLayout(FlowLayout.LEADING));
		this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		this.add(textPanel);
		this.add(scriptPanel);
		this.add(bottomPanel);
	}

	public String getMedicationName(){
		return medicationNameField.getText();
	}
	public int getStrength(){
		if (!strengthField.getText().equals("")){
			return Integer.parseInt(strengthField.getText());
		}else{
			return -1;
		}
	}
	public String getRoute(){
		return routeField.getText();
	}
	public String getFreq(){
		return freqField.getText();
	}
	public String getUnit(){
		return unitField.getText();
	}
	public void setTextField(String textField) {
		this.textField.setText(textField);
	}
	public void setMedicationNameField(String medicationNameField) {
		this.medicationNameField.setText(medicationNameField);
	}
	public void setStrengthField(String strengthField) {
		this.strengthField.setText(strengthField);
	}
	public void setUnitField(String unitField) {
		this.unitField.setText(unitField);
	}
	public void setFreqField(String freqField) {
		this.freqField.setText(freqField);
	}
	public void setRouteField(String routeField) {
		this.routeField.setText(routeField);
	}
	public void setScriptField(String scriptField) {
		this.scriptField.setText(scriptField);
	}
	public void addGoListener(ActionListener listener){
		this.goButton.addActionListener(listener);
	}
	public void addTextFieldListener(DocumentListener listener){
		this.medicationNameField.getDocument().addDocumentListener(listener);
		this.routeField.getDocument().addDocumentListener(listener);
		this.freqField.getDocument().addDocumentListener(listener);
		this.strengthField.getDocument().addDocumentListener(listener);
		this.unitField.getDocument().addDocumentListener(listener);
	}
	public void addTextFieldListener(ActionListener listener){
		this.medicationNameField.addActionListener(listener);
	}
	public void addClearListener(ActionListener listener){
		this.clearButton.addActionListener(listener);
	}
	public String getConsole(){
		return this.console.getText();
	}
	public void setConsole(String value){
		this.console.setText(value);
	} 
	public void clearInputFields(){
		this.medicationNameField.setText("");
		this.routeField.setText("");
		this.strengthField.setText("");
		this.unitField.setText("");
		this.freqField.setText("");
		this.scriptField.setText("");
	}
	public String getInputText(){
		String return_string = "";
		try{return_string += this.medicationNameField.getText()+" ";}catch(NullPointerException e){}
		try{return_string += this.strengthField.getText()+" ";}catch(NullPointerException e){}
		try{return_string += this.unitField.getText()+" ";}catch(NullPointerException e){}
		try{return_string += this.routeField.getText()+" ";}catch(NullPointerException e){}
		try{return_string += this.freqField.getText();}catch(NullPointerException e){}
		return return_string;
	}
			
}
