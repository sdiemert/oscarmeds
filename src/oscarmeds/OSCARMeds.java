/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oscarmeds;
import controller.*;
import view.*;
import model.*;
/**
 *
 * @author simondiemert
 */
public class OSCARMeds {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		OSCARMedsView theView = new OSCARMedsView();
		OSCARMedsModel theModel = new OSCARMedsModel(new Patient("George"));
		OSCARMedsController theController = new OSCARMedsController(theView, theModel);
		theView.setVisible(true);
	}
}
