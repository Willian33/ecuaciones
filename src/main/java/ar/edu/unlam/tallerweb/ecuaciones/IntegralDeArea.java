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
		EcuacionLineal ecuacionLineal = (EcuacionLineal) ecuacion;
		if((ecuacion == null) || (inicio == null) || (fin == null) || (incremento == null)){
			throw new RuntimeException("No implementado");
		}
		Double resultadoEcuacion = (ecuacionLineal.getM().doubleValue()*((Math.pow(fin.doubleValue(), 2))/2) + ecuacionLineal.getB().doubleValue() * fin.doubleValue()) - (ecuacionLineal.getM().doubleValue()*((Math.pow(inicio.doubleValue(), 2))/2) + ecuacionLineal.getB().doubleValue() * inicio.doubleValue());
		return resultadoEcuacion;
	}

}