package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Tu nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Tu apellido: ");
		String apellido = entrada.nextLine();
		
		System.out.print(nombre + apellido);
		entrada.close();

	}

}
