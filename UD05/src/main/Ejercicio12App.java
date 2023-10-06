package main;

import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {
		String contraseña_real = "contraseña";

		int intentos = 0;
		String contraseña;
		do {
			contraseña = JOptionPane.showInputDialog("Introduce la contraseña");
			intentos++;
		}
		while(!contraseña.equals(contraseña_real) && intentos < 3);
		
		if(contraseña.equals(contraseña_real)) {
			JOptionPane.showMessageDialog(null, "Enhorabuena");
		}

	}

}
