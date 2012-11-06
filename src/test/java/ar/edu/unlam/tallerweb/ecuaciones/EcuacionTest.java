package ar.edu.unlam.tallerweb.ecuaciones;

import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Agregue los tests que considere necesarios. Se proporciona un test
 * a modo de testigo.
 *
 */
public class EcuacionTest {

	/*@Test
	public void test() {
		fail("No implementado");
	}*/
	
	@Test
	public void probarQueSePuedaCrearUnaEcuacionLineal(){
		EcuacionLineal ecuacionLineal1 = new EcuacionLineal(5.0 , 2.0);
		Assert.assertNotNull(ecuacionLineal1);
	}
	
	@Test
	public void probarQueResuelvaUnaEcuacionLineal(){
		EcuacionLineal ecuacionLineal1 = new EcuacionLineal(1.0 , 2.0);
		Assert.assertEquals(7, ecuacionLineal1.resolver(5.0), 0);
	}

	@Test
	public void probarQueSePuedaCrearUnaEcuacionCuadratica(){
		EcuacionCuadratica ecuacionCuadratica1 = new EcuacionCuadratica(1.0 , 2.0, 3.0);
		Assert.assertNotNull(ecuacionCuadratica1);
	}
	
	@Test
	public void probarQueResuelvaUnaEcuacionCuadratica(){
		EcuacionCuadratica ecuacionCuadratica1 = new EcuacionCuadratica(1.0 , 2.0, 3.0);
		Assert.assertEquals(14.25, ecuacionCuadratica1.resolver(2.5), 0);
	}
	
	@Test
	public void probarQueSePuedaCrearUnaEcuacionPolinomica(){
		List<Double> coeficientes = new LinkedList<Double>();
		 for(Double i = 1.0; i < 4; i++){
			 coeficientes.add(i);
         }
		EcuacionPolinomica ecuacionPolinomica1 = new EcuacionPolinomica(coeficientes);
		Assert.assertEquals(24.75, ecuacionPolinomica1.resolver(2.5), 0);
	}
}