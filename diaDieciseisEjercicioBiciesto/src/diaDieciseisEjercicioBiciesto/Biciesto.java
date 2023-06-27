package diaDieciseisEjercicioBiciesto;

import java.util.Scanner;

public class Biciesto {

	public static void main(String[] args) {
		
		Operacion calcular = new Operacion();
		
		
		Scanner dato = new Scanner(System.in);
		
		System.out.print("Ingrese el año: ");
		int año = dato.nextInt();
		
		calcular.setAño(año);
		
		calcular.conversionAño();
	
		
		
		
		
		
		
		

	}

}
