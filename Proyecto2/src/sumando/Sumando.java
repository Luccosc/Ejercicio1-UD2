package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int suma1 = entrada.nextInt();
		System.out.print("Introduce otro numero: ");
		int suma2 = entrada.nextInt();
		int resultado = suma1 + suma2;
		System.out.print("Este es el resultado: " + resultado);
		
		entrada.close();

	}

}
