package Swing.MVC_button.counter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Swing.MVC_button.model.counterModel;
import Swing.MVC_button.view.counterView;

// thao tac trong nut bam
public class counterListener implements ActionListener {

	 private counterView ctv;
	 
	 public counterListener(counterView ctv) {
		this.ctv = ctv;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("da nhan vao nut!");
		String src = e.getActionCommand();
		
		if(src.equals("UP")) {
			this.ctv.increment();
		}else if (src.equals("down")){
			this.ctv.decrement();
		}
	}
	
	

}
