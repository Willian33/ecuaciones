package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa la abstracción del cálculo de la integral bajo
 * la curva proporcionada.
 *
 */
public class IntegralDeArea {

	/**
	 * Calcula el área bajo la curva, utilizando el método de las sumas
	 * de Riemann entre los dos puntos dados.
	 *
	 * @param ecuacion
	 * @param inicio
	 * @param fin
	 * @param incremento
	 * @return el área bajo la curva
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