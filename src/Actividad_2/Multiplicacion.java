
package Actividad_2;

/**
 * Representa la operaci�n producto, recibe los par�metros que introduce el usuario, y procede a realizar la operaci�n aritm�tica, 
 * siempre que los par�metros se encuentren dentro del dominio matem�tico designado a cada tipo de producto. 
 * 
 * Por ejemplo: Si en producto2, el usuario introduce operandos que no son de tipo entero, 
 * pedir� introducir ese tipo de n�meros para poder realizar continuar con la operaci�n.
 *
 * @author <b>M�nica de la Puebla Pascual</b>
 * @version 2.0
 * 
 */

public class Multiplicacion {

	/** 
	 * <b>M�todo 1:</b> Producto de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida, que ser� la soluci�n. 
	 * 
	 * @param num1 
	 * 			Primer n�mero que introduce el usuario (double)
	 * @param num2 
	 * 			Segundo n�mero que introduce el usuario (double)
	 * 
	 * @return <b>product1</b> 
	 * 			Devuelve el producto de num1 y num2 (double)
	 * 
	 */
	public double multiplicar1 (double num1, double num2) {
		return num1 * num2;
	}
}

