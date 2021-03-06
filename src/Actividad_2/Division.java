package Actividad_2;

/**
 * Representa la operaci�n de divisi�n; �sta recibe los par�metros que introduce el usuario, y procede a realizar la operaci�n aritm�tica
 * siempre que los par�metros, se encuentren dentro del dominio matem�tico designado a cada tipo de divisi�n. 
 * 
 * 
 * @author <b>Adri�n Nuevo P�rez</b>
 * @version 4.0
 * 
 */

public class Division {

	/** 
	 * <b>M�todo 1:</b> Divisi�n de dos n�meros reales, tendr� 2 par�metros de entrada y uno de salida, que ser� la soluci�n. 
	 * 
	 * @param num1
	 * 			Primer n�mero que introduce el usuario: es dividendo (double)
	 * @param num2
	 * 		    Segundo n�mero que introduce el usuario: es el divisor (double)
	 * 
	 * @return <b>div1</b>
	 * 			Resultado del cociente de num1 entre num2 (double)
	 * 
	 * Como caso especial, se ha tenido en cuenta el ajuste de decimales,
	 * empleando para ello la propiedad round
	 * 
	 */

	public double dividir1 (double num1, double num2) throws Exception {
		double roundResultado = Math.round((num1/num2)*1000000000)/1000000000.0;
		if(num2==0) {
			throw new Exception("No se puede dividir entre 0 porque obtendr�mos una excepci�n de valor aritm�tico, pues el resultado es igual a infinito.");
		}
		return roundResultado;
	}
	
	/** 
	 * <b>M�todo 2:</b> Divisi�n de dos n�meros enteros (los reales incluye a los enteros, pero los enternos son valores cuyos elementos de su conjunto n�merico
	 * contiene los n�meros naturales), dicha operaci�n tendr� 2 par�metros de entrada y uno de salida que ser� la soluci�n. 
	 * 
	 * @param num1 
	 * 			Primer n�mero que introduce el usuario: es dividendo (int)
	 * @param num2 
	 * 			Segundo n�mero que introduce el usuario: es el divisor (int)
	 * 
	 * @return <b>div2</b>
	 * 			Resultado del cociente de num1 entre num2 (int)
	 */

	public int dividir2 (int num1, int num2) throws Exception {
		if(num2==0) {
			throw new Exception("No se puede dividir entre 0 porque obtendr�mos una excepci�n de valor aritm�tico, pues el resultado es igual a infinito.");
		}
		return num1 / num2;
	}
	
	/**
	 * <b>M�todo 3:</b> Inverso de un n�mero real, tendr� un par�metro de entrada y uno de salida que ser� la soluci�n.
	 * 
	 * @param num1
	 * 			N�mero que introduce el usuario (double)
	 * 
	 * 
	 * @return <b>div3</b>
	 * 			Resultado es 1 y se obtiene de num1 = num1 (-1) (double)
	 * 
	 * Como caso especial, se ha tenido en cuenta el ajuste de decimales,
	 * empleando para ello la propiedad round
	 */

	public double dividir3 (double num1) throws Exception {
		double roundResultado = Math.round((1/num1)*1000000000)/1000000000.0;
		if(num1==0) {
			throw new Exception("No se puede calcular el inverso de 0 porque obtendr�mos una excepci�n de valor aritm�tico, pues el resultado es igual a infinito");
		}
		return roundResultado;
		
	}
	
	/**
	 * <b>M�todo 4:</b> Ra�z de un n�mero, tendr� un par�metro de entrada y uno de salida que ser� la soluci�n
	 * 
	 * @param num1
	 * 			N�mero que introduce el usuario (double)
	 * 
	 * @return <b>div4</b>
	 * 			Devolver� el resultado de Math.sqrt(num1). (double)
	 * 
	 * Como caso especial, se ha tenido en cuenta el ajuste de decimales,
	 * empleando para ello la propiedad round
	 * 
	 */
		
	public double dividir4 (double num1) throws Exception {
		double roundResultado = Math.round((Math.sqrt(num1))*1000000000)/1000000000.0;
		if(num1<0) {
			throw new Exception("La ra�z solo se pueden calcular de n�meros positivos");
		}
		return  roundResultado;
	}
}