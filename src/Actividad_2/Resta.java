package Actividad_2;

/**
 * Representa la operaci�n de resta; �sta recibe los par�metros que introduce el
 * usuario, y procede a realizar la operaci�n aritm�tica siempre que los
 * par�metros, se encuentren dentro del dominio matem�tico designado a cada tipo
 * de resta.
 * 
 * 
 * @author <b>Carlos Fuentes V�zquez</b>
 * @version 4.0
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
	 * Como caso especial, se ha tenido en cuenta el ajuste de decimales,
	 * empleando para ello la propiedad round
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
	 * Como caso especial, se ha tenido en cuenta el ajuste de decimales,
	 * empleando para ello la propiedad round
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
	 * <b>M�todo 4:</b> Resta con valor acumulado, tendr� un par�metro de entrada y
	 * la clase deber� de guardar el valor acumulado.
	 * 
	 * @param num1 Representa el n�mero a restar que introduce el usuario para que
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