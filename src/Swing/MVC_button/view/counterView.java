package Swing.MVC_button.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Swing.MVC_button.counter.counterListener;
import Swing.MVC_button.model.counterModel;

public class counterView extends JFrame{
	private counterModel counterModel;
	private JButton jButton_up;
	private JButton jButton_down;
	private JLabel jLabel_value;
	
	public counterView() {
		this.counterModel = new counterModel();
		this.init();
		this.setVisible(true);
	}
	public void init() {
		this.setTitle("Counter");
		
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener ac = new counterListener(this);
		
		
		jButton_up = new JButton("UP");
		jButton_up.addActionListener(ac);
		jButton_down =  new JButton("down");
		jButton_down.addActionListener(ac);
		jLabel_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);
		
		JPanel jPanel= new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jButton_up, BorderLayout.WEST);
		jPanel.add(jLabel_value, BorderLayout.CENTER);
		jPanel.add(jButton_down, BorderLayout.EAST);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
		
		
	}
	
	public void increment() {
		this.counterModel.increament();
		this.jLabel_value.setText(this.counterModel.getValue()+ "");

	}
	public void decrement() {
		this.counterModel.decrement();
		this.jLabel_value.setText(this.counterModel.getValue()+ "");

	}
	
}
