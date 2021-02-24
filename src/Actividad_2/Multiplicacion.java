
package Actividad_2;

/**
 * Representa la operación producto, recibe los parámetros que introduce el usuario, y procede a realizar la operación aritmética, 
 * siempre que los parámetros se encuentren dentro del dominio matemático designado a cada tipo de producto. 
 * 
 * Por ejemplo: Si en producto2, el usuario introduce operandos que no son de tipo entero, 
 * pedirá introducir ese tipo de números para poder realizar continuar con la operación.
 *
 * @author <b>Mónica de la Puebla Pascual</b>
 * @version 2.0
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
}

