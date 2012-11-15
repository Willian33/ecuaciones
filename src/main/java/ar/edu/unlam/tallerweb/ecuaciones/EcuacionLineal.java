package ar.edu.unlam.tallerweb.ecuaciones;

/*
 * Representa una ecuación lineal del tipo f(x) = m × x + b
 *
 */
public class EcuacionLineal implements Ecuacion {

	/*
	 * Constructor parametrizado
	 *
	 * @param m la pendiente
	 * @param b la ordenada al orígen
	 *
	 */

	private Double m;
	private Double b;
	public EcuacionLineal(final Double m, final Double b) {
		if ((m == null) || (b == null))
		{
			throw new RuntimeException("No implementado");
		}
		this.m = m.doubleValue();
		this.b = b.doubleValue();
	}
	/*
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	final public Double resolver(final Double x) {
		if (x == null){
			throw new RuntimeException("No implementado");
		}
		Double resultadoEcuacion = (this.m.doubleValue() * x.doubleValue()) + this.b.doubleValue();
		return resultadoEcuacion;
	}
}