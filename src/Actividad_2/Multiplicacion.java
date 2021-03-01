package Actividad_2;

/**
 * Representa la operaci�n producto, recibe los par�metros que introduce el usuario, y procede a realizar la operaci�n aritm�tica, 
 * siempre que los par�metros se encuentren dentro del dominio matem�tico designado a cada tipo de producto. 
 * 
 * Por ejemplo: Si en producto2, el usuario introduce operandos que no son de tipo entero, 
 * pedir� introducir ese tipo de n�meros para poder realizar continuar con la operaci�n.
 *
 * @author <b>Ra�l L�pes Lopez - Adri�n Nuevo P�rez - Carlos Fuentes V�zquez</b>
 * @version 4.0
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
	 * Como caso especial, se ha tenido en cuenta el ajuste de decimales,
	 * empleando para ello la propiedad round
	 * 
	 */
	public double multiplicar1 (double num1, double num2) {
		double roundResultado = Math.round((num1*num2)*1000000000)/1000000000.0;
		return roundResultado;
	}
	
	/** 
	 * <b>M�todo 2:</b> Producto de dos n�meros enteros, tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n. 
	 * 
	 * @param num1 
	 * 			Primer n�mero a multiplicar que introduce el usuario (int)
	 * @param num2 
	 * 			Segundo n�mero a multiplicar que introduce el usuario (int)
	 *
	 * @return <b>product2</b>  
	 * 			Devuelve el producto de num1 y num2 (int)
	 * 
	 */
	
	public int multiplicar2 (int num1, int num2) {
		return num1 * num2;
	}

	/** 
	 * <b>M�todo 3:</b> Producto de tres n�meros reales, tendr� 3 par�metros de entrada y uno de salida que ser� la soluci�n. 
	 * 
	 * @param num1 
	 * 			Primer n�mero a multiplicar que introduce el usuario (double)
	 * @param num2 
	 * 			Segundo n�mero a multiplicar que introduce el usuario (double)
	 * @param num3 
	 * 			Tercer n�mero a multiplicar que introduce el usuario (double)
	 *
	 * @return <b>product3</b>  
	 * 			Devuelve el producto de los par�metros num1, num2 y num3 (double)
	 * 
	 * Como caso especial, se ha tenido en cuenta el ajuste de decimales,
	 * empleando para ello la propiedad round
	 * 
	 */
	
	public double multiplicar3 (double num1, double num2, double num3) {
		double roundResultado = Math.round((num1*num2*num3)*1000000000)/1000000000.0;
		return roundResultado;
	}
	
	/** 
	 * <b>M�todo 4:</b> Potencia, tendr� dos par�metros de entrada (base y exponente) y uno de salida que ser� la soluci�n. 
	 * 
	 * @param num1 
	 * 			Primer n�mero a multiplicar que introduce el usuario, que act�a como el valor de la base (es num1)
	 * @param num2  
	 * 			Segundo n�mero a multiplicar que introduce el usuario, que act�a como el valor del exponente (es num2)
	 *
	 * @return <b>potencia</b> 
	 * 			Devuelve el producto de num1 por s� mismo tantas veces como indique el num2
	 * 
	 * Como caso especial, se ha tenido en cuenta el ajuste de decimales,
	 * empleando para ello la propiedad round
	 * 
	 */
	
	public double multiplicar4 (double num1, double num2) {
		double roundResultado = Math.round((Math.pow(num1, num2))*1000000000)/1000000000.0;
		return roundResultado;
	}
	
}