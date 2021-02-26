package Actividad_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Suma instanciaSuma = new Suma();
		Resta instanciaResta = new Resta ();
		Division instanciaDivision = new Division();

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
					"Introduzca operación: suma, resta, multiplicacion, division o exit para finalizar la ejecución.");

			operacion = scanner.nextLine();

			switch (operacion) {

			case "suma": {
				
					double resultado;
					resultado = instanciaSuma.sumar2(ope1, ope2);

					System.out.println(
							"El resultado de la suma de: " + ope1 + " y " + ope2 + " es igual a: " + resultado);
				} 

				break;
				
			case "resta": {
				double resultado;
				resultado = instanciaResta.restar2(ope1, ope2);
				
				System.out.println("El resultado de la resta entre: " + ope1 + " y " + ope2 + " es igual a: " + resultado);
				
			}
				break;

			case "division": {
				try {
					double resultado;
					resultado = instanciaDivision.dividir1(ope1, ope2);

					System.out.println(
							"El resultado de la división entre: " + ope1 + " y " + ope2 + " es igual a: " + resultado);
				} catch (Exception e) {
					System.err.println("El programa ha dado una excepción. " + e.getMessage());
				}

			}
				break;

			case "exit": {
				System.out.println("Finalizando ejecucción.");
			}
				break;

			default: {
				System.out.println("La opción no es correcta.");
			}
			}

		} while (!operacion.equalsIgnoreCase("exit"));
		
		scanner.close();

	}

}
