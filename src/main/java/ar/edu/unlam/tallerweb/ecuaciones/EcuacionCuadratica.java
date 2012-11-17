package ar.edu.unlam.tallerweb.ecuaciones;

/*
 * Representa una ecuación cuadrática del tipo
 * f(x) = a × x^2 + b × x + c
 *
 */
public class EcuacionCuadratica implements Ecuacion {

	/*
	 * Constructor parametrizado
	 *
	 * @param a
	 * @param b
	 * @param c
	 *
	 */
	private Double valorA = 0.0;
	private Double valorB;
	private Double valorC;
	public EcuacionCuadratica(final Double a, final Double b, final Double c) {
		if ((b == null) || (c == null)) {
			throw new RuntimeException("No implementado");
		}
		if (a != null) {
			this.valorA = a.doubleValue();
		}
		this.valorB = b.doubleValue();
		this.valorC = c.doubleValue();
		
	}

	/*
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public final Double resolver(final Double x) {
		Double resultadoEcuacion = (this.valorA.doubleValue() * Math.pow(x.doubleValue(), 2)) + (this.valorB.doubleValue() * x.doubleValue()) + this.valorC.doubleValue();
		return resultadoEcuacion.doubleValue();
	}
}
