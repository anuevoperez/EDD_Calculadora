
package Actividad_2;


public class Suma {
	/*
	 * 
	 * Representa la operación de suma, que recibe los parámetros que introduce el usuario, y procede a realizar la operación aritmética
	 * siempre que los parámetros se encuentren dentro del dominio matemático designado a cada tipo de suma. 
	 * 
	 * Por ejemplo: Si en suma2, el usuario introduce operandos que no son de tipo entero, 
	 * pedirá introducir ese tipo de números para poder continuar con la operación.
	 *
	 * @author <b>Raúl Lópes López.</b>
	 * @version 2.0
	 * 
	 */
	
	/** 
	 * <b>Método 1:</b> Suma de dos números reales, tendrá 2 parámetros de entrada y uno de salida, que será la solución.
	 * 
	 * 
	 * @param num1 
	 * 			Primer número que introduce el usuario, de tipo real (double)
	 * @param num2 
	 * 			Segundo número que introduce el usuario, (double)
	 *
	 * @return <b>sum1</b> 
	 * 			Suma de los parámetros num1 y num2 (double). 
	 * 
	 */
	
	public double sumar1 (double num1, double num2) {
		return num1 + num2;
		
	}
	
	/** 
	 * <b>Método 2:</b>  Suma de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
	 *
	 * @param num1 
	 * 			Primer número a sumar que introduce el usuario (int)
	 * @param num2 
	 * 			Segundo número a sumar que introduce el usuario (int)
	 *
	 * @return <b>sum2</b> 
	 * 			Suma de los parámetros num1 y num2 (int)
	 * 
	 */

	public int sumar2 (int num1, int num2) {
		return num1 + num2;
	}
	
	/** 
	 * <b>Método 3:</b>  Suma de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
	 * 
	 * @param num1 
	 * 			Primer número a sumar que introduce el usuario, de tipo real (double)
	 * @param num2 
	 * 			Segundo número a sumar que introduce el usuario, (double)
	 * @param num3 
	 * 			Tercer número a sumar que introduce el usuario, (double)
	 * 
	 * @return <b>sum3</b> 
	 * 			Suma de los parámetros num1, num2 y num3
	 * 
	 */
	
	public double sumar3 (double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
	

	
	/** 
	 *<b>Método 4:</b>  Suma con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor acumulado.
	 *  
	 * @param num1 
	 * 			Representa el número a sumar que introduce el usuario para que se sume al acumulado en memoria (double)
	 *
	 * @return <b>sum4</b> 
	 * 			Devuelve la resta de acum y num1 (double)
	 */
	
	double acum = 0;
	
	public double sumar4 (double num1) {
		
		double sum4 = acum - num1;
		acum = sum4;
		return sum4;
	}
}
