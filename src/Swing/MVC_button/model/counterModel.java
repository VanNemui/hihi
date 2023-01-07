package Swing.MVC_button.model;

public class counterModel {
	 private int value;
	 
	 public counterModel() {
		this.value=0;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	 
	 public void increament() {
		 this.value++;
	 }
	 
	 public void decrement() {
		this.value--;
	}
}
