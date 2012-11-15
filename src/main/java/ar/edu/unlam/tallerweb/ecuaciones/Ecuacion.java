package ar.edu.unlam.tallerweb.ecuaciones;

/*
 * Abstracci�n que representa todo tipo de ecuaci�n con
 * una inc�gnita
 *
 */
public interface Ecuacion {

	/*
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	Double resolver(Double x);
	
}
