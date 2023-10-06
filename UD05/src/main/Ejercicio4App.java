package main;

import javax.swing.JOptionPane;

public class Ejercicio4App {

	public static void main(String[] args) {
		String string_radio = JOptionPane.showInputDialog("Introduce el radio del círculo (mayor que 0)");
		double radio = Double.parseDouble(string_radio);
		
		if(radio>0) {
			double area = Math.PI*(Math.pow(radio, 2));
			System.out.println("El área es "+area);
		}
		else {
			System.out.println("El radio ha de ser mayor que 0");
		}
	}
}
