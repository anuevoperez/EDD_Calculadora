package Actividad_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Division instanciaDivision = new Division();
		Resta instanciaResta = new Resta ();

		Scanner scanner = new Scanner(System.in);
		String operacion = "";
		int ope1, ope2;

		do {

			System.out.println(
					"----------------------------------------------------------------------------------------------.");
			System.out.println("Introduzca el primer operador.");

			ope1 = Integer.parseInt(scanner.nextLine());

			System.out.println(
					"----------------------------------------------------------------------------------------------.");
			System.out.println("Introduzca el segundo operador.");

			ope2 = Integer.parseInt(scanner.nextLine());

			System.out.println(
					"----------------------------------------------------------------------------------------------.");
			System.out.println(
					"Introduzca operaci�n: suma, resta, multiplicacion, division o salir para finalizar la ejecuci�n.");

			operacion = scanner.nextLine();

			switch (operacion) {
			
			case "resta": {
				double resultado;
				resultado = instanciaResta.restar2(ope1, ope2);
				
				System.out.println("El resultado de la resta entre: " + ope1 + " y " + ope2 + " es igual a: " + resultado);
				System.out.println("�Desea salir o o continuar?");
				operacion = scanner.nextLine().toLowerCase();
				
			}
				break;

			case "division": {
				try {
					double resultado;
					resultado = instanciaDivision.dividir1(ope1, ope2);

					System.out.println(
							"El resultado de la divisi�n entre: " + ope1 + " y " + ope2 + " es igual a: " + resultado);
				} catch (Exception e) {
					System.err.println("El programa ha dado una excepci�n. " + e.getMessage());
				}

			}
				break;

			case "exit": {
				System.out.println("Finalizando ejecucci�n.");
			}
				break;

			default: {
				System.out.println("La opci�n no es correcta.");
			}
			}

		} while (!operacion.equalsIgnoreCase("salir"));

		scanner.close();
	}

}
