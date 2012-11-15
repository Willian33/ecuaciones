package ar.edu.unlam.tallerweb.ecuaciones;

/*
 * Representa la abstracci�n del c�lculo de la integral bajo
 * la curva proporcionada.
 *
 */
public class IntegralDeArea {

	/*
	 * Calcula el �rea bajo la curva, utilizando el m�todo de las sumas
	 * de Riemann entre los dos puntos dados.
	 *
	 * @param ecuacion
	 * @param inicio
	 * @param fin
	 * @param incremento
	 * @return el �rea bajo la curva
	 */

	final public Double calcular(final Ecuacion ecuacion, final Double inicio, final Double fin, final Double incremento) {
		double resultado = 0.0;	
		double delta = (fin - inicio) / incremento;
		double semiIncremento = incremento/2;
		double valorX = inicio;
		double cantidadIteraciones = (fin - inicio) * incremento;
		for (int i = 0; i < cantidadIteraciones; i++)
		{
			resultado += Math.abs(delta * ecuacion.resolver(valorX + semiIncremento));
			valorX += delta;
		}
		return resultado;
	}
}