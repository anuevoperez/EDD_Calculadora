package Actividad_2;

/**
 * Representa la operación de resta; ésta recibe los parámetros que introduce el
 * usuario, y procede a realizar la operación aritmética siempre que los
 * parámetros, se encuentren dentro del dominio matemático designado a cada tipo
 * de resta.
 * 
 * 
 * @author <b>Carlos Fuentes Vázquez</b>
 * @version 4.0
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
	 * Como caso especial, se ha tenido en cuenta el ajuste de decimales,
	 * empleando para ello la propiedad round
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
	 * Como caso especial, se ha tenido en cuenta el ajuste de decimales,
	 * empleando para ello la propiedad round
	 * 
	 */

	public int restar2(int num1, int num2) {
		return num1 - num2;

	}

	/**
	 * <b>Método 3:</b> Resta de tres números reales, tendrá 3 parámetros de entrada
	 * y uno de salida que será la solución.
	 * 
	 * @param num1 Primer número a restar que introduce el usuario (double)
	 * @param num2 Segundo número que a estar introduce el usuario (double)
	 * @param num3 Tercer número que a restar introduce el usuario (double)
	 *
	 * @return <b>rest3</b> Devuelve la resta de los parámetros num1, num2 y num3
	 *         (double)
	 * 
	 * Como caso especial, se ha tenido en cuenta el ajuste de decimales,
	 * empleando para ello la propiedad round
	 * 
	 */

	public double restar3(double num1, double num2, double num3) {
		double roundResultado = Math.round((num1 - num2 - num3) * 1000000000) / 1000000000.0;
		return roundResultado;
	}

	/**
	 * <b>Método 4:</b> Resta con valor acumulado, tendrá un parámetro de entrada y
	 * la clase deberá de guardar el valor acumulado.
	 * 
	 * @param num1 Representa el número a restar que introduce el usuario para que
	 *             se reste al acumulado en memoria (double)
	 *
	 * @return <b>rest4</b> Devuelve la resta de acum y num1 (double)
	 * 
	 * Como caso especial, se ha tenido en cuenta el ajuste de decimales,
	 * empleando para ello la propiedad round
	 * 
	 */

	double acum = 0;

	public double restar4(double num1) {

		double roundResultado = Math.round((acum - num1) * 1000000000) / 1000000000.0;
		acum = roundResultado;
		return roundResultado;
	}

}