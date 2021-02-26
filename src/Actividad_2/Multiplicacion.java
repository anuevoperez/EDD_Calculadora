
package Actividad_2;

/**
 * Representa la operación producto, recibe los parámetros que introduce el usuario, y procede a realizar la operación aritmética, 
 * siempre que los parámetros se encuentren dentro del dominio matemático designado a cada tipo de producto. 
 * 
 * Por ejemplo: Si en producto2, el usuario introduce operandos que no son de tipo entero, 
 * pedirá introducir ese tipo de números para poder realizar continuar con la operación.
 *
 * @author <b>Raúl Lópes Lopez - Adrián Nuevo Pérez - Carlos Fuentes Vázquez</b>
 * @version 3.0
 * 
 */

public class Multiplicacion {

	/** 
	 * <b>Método 1:</b> Producto de dos números reales, tendrá 2 parámetros de entrada y uno de salida, que será la solución. 
	 * 
	 * @param num1 
	 * 			Primer número que introduce el usuario (double)
	 * @param num2 
	 * 			Segundo número que introduce el usuario (double)
	 * 
	 * @return <b>product1</b> 
	 * 			Devuelve el producto de num1 y num2 (double)
	 * 
	 */
	public double multiplicar1 (double num1, double num2) {
		return num1 * num2;
	}
	
	/** 
	 * <b>Método 2:</b> Producto de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución. 
	 * 
	 * @param num1 
	 * 			Primer número a multiplicar que introduce el usuario (int)
	 * @param num2 
	 * 			Segundo número a multiplicar que introduce el usuario (int)
	 *
	 * @return <b>product2</b>  
	 * 			Devuelve el producto de num1 y num2 (int)
	 * 
	 */
	
	public int multiplicar2 (int num1, int num2) {
		return num1 * num2;
	}

	/** 
	 * <b>Método 3:</b> Producto de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución. 
	 * 
	 * @param num1 
	 * 			Primer número a multiplicar que introduce el usuario (double)
	 * @param num2 
	 * 			Segundo número a multiplicar que introduce el usuario (double)
	 * @param num3 
	 * 			Tercer número a multiplicar que introduce el usuario (double)
	 *
	 * @return <b>product3</b>  
	 * 			Devuelve el producto de los parámetros num1, num2 y num3 (double)
	 * 
	 */
	
	public double multiplicar3 (double num1, double num2, double num3) {
		return num1 * num2 * num3;
	}
	
	/** 
	 * <b>Método 4:</b> Potencia, tendrá dos parámetros de entrada (base y exponente) y uno de salida que será la solución. 
	 * 
	 * @param num1 
	 * 			Primer número a multiplicar que introduce el usuario, que actúa como el valor de la base (es num1)
	 * @param num2  
	 * 			Segundo número a multiplicar que introduce el usuario, que actúa como el valor del exponente (es num2)
	 *
	 * @return <b>potencia</b> 
	 * 			Devuelve el producto de num1 por sí mismo tantas veces como indique el num2
	 * 
	 */
	
	public double multiplicar4 (double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
}

