package main;

import javax.swing.JOptionPane;

public class Ejercicio10App {

	public static void main(String[] args) {
		String string_ventas = JOptionPane.showInputDialog("Introduce el número de ventas");
		int ventas = Integer.parseInt(string_ventas);

		if(ventas>0) {
			double suma_ventas = 0;
			for(int i=1; i<=ventas; i++) {
				String string_precio = JOptionPane.showInputDialog("Introduce el precio de la venta "+i);
				double precio = Double.parseDouble(string_precio);
				
				suma_ventas = suma_ventas + precio;

			}
			System.out.println("La suma de todas las ventas es de "+suma_ventas);
		}
		else {
			System.out.println("Las ventas han de ser mayores que 0");
		}
	}

}
