package Actividad_2;

/**
 * Representa la operación de resta; ésta recibe los parámetros que introduce el
 * usuario, y procede a realizar la operación aritmética siempre que los
 * parámetros, se encuentren dentro del dominio matemático designado a cada tipo
 * de resta.
 * 
 * 
 * @author <b>Carlos Fuentes Vázquez</b>
 * @version 3.0
 * 
 */

public class Resta {

	/**
	 * <b>Método 1:</b> Resta de dos números reales, tendrá 2 parámetros de entrada
	 * y uno de salida, que será la solución.
	 * 
	 * @param num1 Primer número a restar que introduce el usuario (double)
	 * @param num2 Segundo número a restar que introduce el usuario (double)
	 *
	 * @return <b>rest1</b> Devuelve la resta de num1 y num2
	 * 
	 */

	public double restar1(double num1, double num2) {
		double roundResultado = Math.round((num1 - num2) * 1000000000) / 1000000000.0;
		return roundResultado;
	}

	/**
	 * <b>Método 2:</b> Resta de dos números enteros, tendrá 2 parámetros de entrada
	 * y uno de salida que será la solución.
	 * 
	 * @param num1 Primer número a restar que introduce el usuario (int)
	 * @param num2 Segundo número a restar que introduce el usuario (int)
	 *
	 * @return res2 Devuelve la resta de num1 y num2 (int)
	 * 
	 */

	public int restar2(int num1, int num2) {
		return num1 - num2;

	}
}