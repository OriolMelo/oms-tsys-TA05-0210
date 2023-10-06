package main;

import javax.swing.JOptionPane;

public class CalculadoraInversaApp {

	public static void main(String[] args) {
		String operando1_string = JOptionPane.showInputDialog("Entra el primer operando");
		int operando1 = Integer.parseInt(operando1_string);
		

		String operando2_string = JOptionPane.showInputDialog("Entra el segundo operando");
		int operando2 = Integer.parseInt(operando2_string);
		
		String signo = JOptionPane.showInputDialog("Entra el signo aritmético");
		//int operando2 = Integer.parseInt(operando2_string);
		
		switch(signo) {
			case "+":
				JOptionPane.showMessageDialog(null, operando1+" + "+operando2+ " = " +(operando1+operando2));
				break;
			case "-":
				JOptionPane.showMessageDialog(null, operando1+" - "+operando2+ " = " +(operando1-operando2));
				break;
			case "*":
				JOptionPane.showMessageDialog(null, operando1+" * "+operando2+ " = " +(operando1*operando2));
				break;
			case "/":
				JOptionPane.showMessageDialog(null, operando1+" / "+operando2+ " = " +((double)operando1/(double)operando2));
				break;
			case "^":
				JOptionPane.showMessageDialog(null, operando1+" ^ "+operando2+ " = " +Math.pow(operando1, operando2));
				break;
			case "%":
				JOptionPane.showMessageDialog(null, operando1+" % "+operando2+ " = " +(operando1%operando2));
				break;
			default:
				JOptionPane.showMessageDialog(null, "El signo aritmético ha de ser +, -, *, /, ^ o %");
				
				
		}
	}

}
