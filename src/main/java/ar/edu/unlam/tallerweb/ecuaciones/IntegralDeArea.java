package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa la abstracci�n del c�lculo de la integral bajo
 * la curva proporcionada.
 *
 */
public class IntegralDeArea {

	/**
	 * Calcula el �rea bajo la curva, utilizando el m�todo de las sumas
	 * de Riemann entre los dos puntos dados.
	 *
	 * @param ecuacion
	 * @param inicio
	 * @param fin
	 * @param incremento
	 * @return el �rea bajo la curva
	 */
	
	public Double calcular(Ecuacion ecuacion, Double inicio,Double fin, Double incremento) {
		
		double resultado = 0.0;	
		double delta = (fin - inicio) / incremento;
		double semiIncremento = incremento/2;
		double valorX = inicio;
		for (int i = 0; i < incremento; i++)
		{
			resultado += delta * ecuacion.resolver(valorX + semiIncremento);
			valorX += delta;
		}
		
		return resultado;
	}
}