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
	
	/** 
	 * <b>Método 2:</b> División de dos números enteros (los reales incluye a los enteros, pero los enternos son valores cuyos elementos de su conjunto númerico
	 * contiene los números naturales), dicha operación tendrá 2 parámetros de entrada y uno de salida que será la solución. 
	 * 
	 * @param num1 
	 * 			Primer número que introduce el usuario: es dividendo (int)
	 * @param num2 
	 * 			Segundo número que introduce el usuario: es el divisor (int)
	 * 
	 * @return <b>div2</b>
	 * 			Resultado del cociente de num1 entre num2 (int)
	 */

	public int dividir2 (int num1, int num2) {
		return num1 / num2;
	}
	
	/**
	 * <b>Método 3:</b> Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.
	 * 
	 * @param num1
	 * 			Número que introduce el usuario (double)
	 * 
	 * 
	 * @return <b>div3</b>
	 * 			Resultado es 1 y se obtiene de num1 = num1 (-1) (double)
	 */

	public double multiplicar3 (double num1) {
		return num1;
	}
	
}
