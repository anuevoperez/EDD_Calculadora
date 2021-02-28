package Actividad_2;

/**
 * Representa la operaci�n de resta; �sta recibe los par�metros que introduce el
 * usuario, y procede a realizar la operaci�n aritm�tica siempre que los
 * par�metros, se encuentren dentro del dominio matem�tico designado a cada tipo
 * de resta.
 * 
 * 
 * @author <b>Carlos Fuentes V�zquez</b>
 * @version 3.0
 * 
 */

public class Resta {

	/**
	 * <b>M�todo 1:</b> Resta de dos n�meros reales, tendr� 2 par�metros de entrada
	 * y uno de salida, que ser� la soluci�n.
	 * 
	 * @param num1 Primer n�mero a restar que introduce el usuario (double)
	 * @param num2 Segundo n�mero a restar que introduce el usuario (double)
	 *
	 * @return <b>rest1</b> Devuelve la resta de num1 y num2
	 * 
	 */

	public double restar1(double num1, double num2) {
		double roundResultado = Math.round((num1 - num2) * 1000000000) / 1000000000.0;
		return roundResultado;
	}

	/**
	 * <b>M�todo 2:</b> Resta de dos n�meros enteros, tendr� 2 par�metros de entrada
	 * y uno de salida que ser� la soluci�n.
	 * 
	 * @param num1 Primer n�mero a restar que introduce el usuario (int)
	 * @param num2 Segundo n�mero a restar que introduce el usuario (int)
	 *
	 * @return res2 Devuelve la resta de num1 y num2 (int)
	 * 
	 */

	public int restar2(int num1, int num2) {
		return num1 - num2;

	}

	/**
	 * <b>M�todo 3:</b> Resta de tres n�meros reales, tendr� 3 par�metros de entrada
	 * y uno de salida que ser� la soluci�n.
	 * 
	 * @param num1 Primer n�mero a restar que introduce el usuario (double)
	 * @param num2 Segundo n�mero que a estar introduce el usuario (double)
	 * @param num3 Tercer n�mero que a restar introduce el usuario (double)
	 *
	 * @return <b>rest3</b> Devuelve la resta de los par�metros num1, num2 y num3
	 *         (double)
	 */

	public double restar3(double num1, double num2, double num3) {
		double roundResultado = Math.round((num1 - num2 - num3) * 1000000000) / 1000000000.0;
		return roundResultado;
	}

}