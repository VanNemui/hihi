package Swing.MVC_button.test;

import javax.swing.UIManager;

import Calculator.myCalculator;
import Swing.MVC_button.model.counterModel;
import Swing.MVC_button.view.counterView;

public class testCounter {
public static void main(String[] args) {
	counterModel ct= new counterModel();
	ct.increament();
	ct.increament();
	ct.decrement();
	System.out.println(ct.getValue());
	
	try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
	counterView ctv=	new counterView();
	} catch (Exception ex) {
		ex.printStackTrace();
	}

}

}
