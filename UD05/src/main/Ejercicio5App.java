package main;
import java.util.Scanner; 
public class Ejercicio5App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		sc.close();
		
		if(numero >= 0) {
			if(numero%2==0)
				System.out.println(numero+" es divisible entre 2");
			else
				System.out.println(numero+" no es divisible entre 2");
		}
		else
			System.out.println("El número no puede ser negativo");
	}

}
