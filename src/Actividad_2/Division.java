package Actividad_2;

/**
 * Representa la operación de división; ésta recibe los parámetros que introduce el usuario, y procede a realizar la operación aritmética
 * siempre que los parámetros, se encuentren dentro del dominio matemático designado a cada tipo de división. 
 * 
 * 
 * @author <b>Adrián Nuevo Pérez</b>
 * @version 2.0
 * 
 */

public class Division {

	/** 
	 * <b>Método 1:</b> División de dos números reales, tendrá 2 parámetros de entrada y uno de salida, que será la solución. 
	 * 
	 * @param num1
	 * 			Primer número que introduce el usuario: es dividendo (double)
	 * @param num2
	 * 		    Segundo número que introduce el usuario: es el divisor (double)
	 * 
	 * @return <b>div1</b>
	 * 			Resultado del cociente de num1 entre num2 (double)
	 * 
	 */

	public double dividir1 (double num1, double num2) {
		return num1 / num2;
	}
}
