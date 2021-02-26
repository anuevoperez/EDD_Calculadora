package Actividad_2;

import java.util.Scanner;

/*
* @author <b>Raúl Lópes Lopez - Adrián Nuevo Pérez - Carlos Fuentes Vázquez</b>
* @version 3.0
*/

public class Main {

	public static void main(String[] args) {

		// Creación de objetos para probar los métodos.

		Suma instanciaSuma = new Suma();
		Resta instanciaResta = new Resta();
		Division instanciaDivision = new Division();
		Multiplicacion instanciaMultiplicacion = new Multiplicacion();

		// Creación del scanner para recoger datos por consola.

		Scanner scanner = new Scanner(System.in);
		String operacion = "";
		int ope1, ope2;

		do {

			System.out.println(
					"----------------------------------------------------------------------------------------------.");
			System.out.println("Introduzca el primer operador.");

			ope1 = Integer.parseInt(scanner.nextLine());

			// Siguiente línea.

			System.out.println(
					"----------------------------------------------------------------------------------------------.");
			System.out.println("Introduzca el segundo operador.");

			ope2 = Integer.parseInt(scanner.nextLine());

			System.out.println(
					"----------------------------------------------------------------------------------------------.");
			System.out.println(
					"Introduzca operación: suma, resta, multiplicacion, division o exit para finalizar la ejecución.");

			operacion = scanner.nextLine();

			/*
			 * Empleamos el switch para que el usuario pueda escoger entre las operaciones.
			 * 
			 * Con el switch va a comparar el método establecido, y una vez compare, cuando
			 * encuentre su método implantado similar, va a dejar de recorrer el código en
			 * ese punto. Con el "break" salimos del bucle para que no siga recorriendo las
			 * demás líneas de código.
			 */

			switch (operacion) {

			case "suma": {

				double resultado;
				resultado = instanciaSuma.sumar2(ope1, ope2);

				System.out.println("El resultado de la suma de: " + ope1 + " y " + ope2 + " es igual a: " + resultado);
			}

				break;

			case "resta": {
				double resultado;
				resultado = instanciaResta.restar2(ope1, ope2);

				System.out.println(
						"El resultado de la resta entre: " + ope1 + " y " + ope2 + " es igual a: " + resultado);

			}
				break;

			case "multiplicacion": {
				double resultado;
				resultado = instanciaMultiplicacion.multiplicar2(ope1, ope2);

				System.out.println("El resultado de la multiplicación entre: " + ope1 + " y " + ope2 + " es igual a: "
						+ resultado);

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

			// Utilizamos la excepción del bucle "do" en "while" para indentificar cuando la
			// consola va a dejar de repetir el proceso del bucle.

			// Mientras operación no sea igual a exit.

		} while (!operacion.equalsIgnoreCase("exit"));

		scanner.close();

	}

}
