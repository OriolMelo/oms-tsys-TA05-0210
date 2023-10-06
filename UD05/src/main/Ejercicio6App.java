package main;

import javax.swing.JOptionPane;

public class Ejercicio6App {

	public static void main(String[] args) {
		String string_precio = JOptionPane.showInputDialog("Introduce un precio de producto");
		double precio = Double.parseDouble(string_precio);

		if(precio>0) {
			final double IVA = 0.21;
			double precio_final = precio+(precio*IVA);
			System.out.println("El producto vale "+precio_final);
		}
		else {
			System.out.println("El precio ha de ser mayor que 0");
		}
	}

}
