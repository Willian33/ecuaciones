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

	private Double valorM;
	private Double valorB;
	public EcuacionLineal(final Double m, final Double b) {
		if ((m == null) || (b == null)){
			throw new RuntimeException("No implementado");
		}
		this.valorM = m.doubleValue();
		this.valorB = b.doubleValue();
	}
	/*
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public final Double resolver(final Double x) {
		if (x == null) {
			throw new RuntimeException("No implementado");
		}
		Double resultadoEcuacion = (this.valorM.doubleValue() * x.doubleValue()) + this.valorB.doubleValue();
		return resultadoEcuacion;
	}
}
