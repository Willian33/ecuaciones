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
	
	private Double a;
	private Double b;
	private Double c;
	
	public EcuacionCuadratica(final Double a, final Double b, final Double c){
		if((a == null) || (a == 0) || (b == null) || (c == null)){
			throw new RuntimeException("No implementado");
		}
		this.a = a.doubleValue();
		this.b = b.doubleValue();
		this.c = c.doubleValue();
	}

	/*
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	final public Double resolver(final Double x) {
		Double resultadoEcuacion = (this.a.doubleValue() * Math.pow(x.doubleValue(), 2)) + (this.b.doubleValue() * x.doubleValue()) + this.c.doubleValue();
		return resultadoEcuacion.doubleValue();
	}
}
