package Actividad_2;

import java.util.Scanner;

/*
* @author <b>Ra�l L�pes Lopez - Adri�n Nuevo P�rez - Carlos Fuentes V�zquez</b>
* @version 3.0
*/

public class Main {

	public static void main(String[] args) {

		// Creaci�n de objetos para probar los m�todos.

		Suma instanciaSuma = new Suma();
		Resta instanciaResta = new Resta();
		Division instanciaDivision = new Division();
		Multiplicacion instanciaMultiplicacion = new Multiplicacion();

		// Creaci�n del scanner para recoger datos por consola.

		Scanner scanner = new Scanner(System.in);
		String operacion = "";
		int ope1, ope2;

		do {

			System.out.println(
					"----------------------------------------------------------------------------------------------.");
			System.out.println("Introduzca el primer operador.");

			ope1 = Integer.parseInt(scanner.nextLine());

			// Siguiente l�nea.

			System.out.println(
					"----------------------------------------------------------------------------------------------.");
			System.out.println("Introduzca el segundo operador.");

			ope2 = Integer.parseInt(scanner.nextLine());

			System.out.println(
					"----------------------------------------------------------------------------------------------.");
			System.out.println(
					"Introduzca operaci�n: suma, resta, multiplicacion, division o exit para finalizar la ejecuci�n.");

			operacion = scanner.nextLine();

			/*
			 * Empleamos el switch para que el usuario pueda escoger entre las operaciones.
			 * 
			 * Con el switch va a comparar el m�todo establecido, y una vez compare, cuando
			 * encuentre su m�todo implantado similar, va a dejar de recorrer el c�digo en
			 * ese punto. Con el "break" salimos del bucle para que no siga recorriendo las
			 * dem�s l�neas de c�digo.
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

				System.out.println("El resultado de la multiplicaci�n entre: " + ope1 + " y " + ope2 + " es igual a: "
						+ resultado);

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

			// Utilizamos la excepci�n del bucle "do" en "while" para indentificar cuando la
			// consola va a dejar de repetir el proceso del bucle.

			// Mientras operaci�n no sea igual a exit.

		} while (!operacion.equalsIgnoreCase("exit"));

		scanner.close();

	}

}
