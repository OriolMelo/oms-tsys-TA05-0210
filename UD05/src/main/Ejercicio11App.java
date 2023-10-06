package main;
import javax.swing.JOptionPane;

public class Ejercicio11App {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Entra un día de la semana en mayúsculas y sin tildes");

		switch (dia) {
			case "LUNES":
				JOptionPane.showMessageDialog(null, dia+" es un día laboral");
				break;
			case "MARTES":
				JOptionPane.showMessageDialog(null, dia+" es un día laboral");
				break;
			case "MIERCOLES":
				JOptionPane.showMessageDialog(null, dia+" es un día laboral");
				break;
			case "JUEVES":
				JOptionPane.showMessageDialog(null, dia+" es un día laboral");
				break;
			case "VIERNES":
				JOptionPane.showMessageDialog(null, dia+" es un día laboral");
				break;
			case "SABADO":
				JOptionPane.showMessageDialog(null, dia+" es un día no laboral");
				break;
			case "DOMINGO":
				JOptionPane.showMessageDialog(null, dia+" es un día no laboral");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Debes introducir un día de la semana en mayúsculas y sin tildes");
				
		}
	}

}
