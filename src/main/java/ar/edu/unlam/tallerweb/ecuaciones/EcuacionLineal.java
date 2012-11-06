package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa una ecuaci�n lineal del tipo f(x) = m � x + b
 *
 */
public class EcuacionLineal implements Ecuacion {

	/**
	 * Constructor parametrizado
	 *
	 * @param m la pendiente
	 * @param b la ordenada al or�gen
	 *
	 */
	
	private Double m;
	private Double b;
	
	public EcuacionLineal(Double m, Double b) {
		if ((m == null) || (b == null)){
			throw new RuntimeException("No implementado");
		}
		this.m = m.doubleValue();
		this.b = b.doubleValue();
	}

	/**
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public Double resolver(Double x) {
		if (x == null){
			throw new RuntimeException("No implementado");
		}
		Double resultadoEcuacion = (this.m.doubleValue() * x.doubleValue()) + this.b.doubleValue();
		return resultadoEcuacion;
	}

	public Double getB() {
		return b;
	}

	public Double getM() {
		return m;
	}
	
	
}