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
}
