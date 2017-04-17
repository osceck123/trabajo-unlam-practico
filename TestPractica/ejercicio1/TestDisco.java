package ejercicio1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDisco {

	@Test
	public void testPerimetroInterior() {
		
		Disco miDisco = new Disco();
		miDisco.radioInterior(4.00);
		
		double valorEsperadoDelPerimetroInterior;
		double valorDelPerimetro;
		
		valorDelPerimetro=miDisco.perimetroInterior();
		valorEsperadoDelPerimetroInterior=25.12;
		assertEquals(valorEsperadoDelPerimetroInterior,valorDelPerimetro, 25.01);
	}

	@Test
	public void testPerimetroExterior()
	{
		Disco miDisco2 = new Disco();
		miDisco2.radioExterior(5.00);
		
		double valorEsperadoDelPerimetroExterior= 31.4;
		double valorDelPerimetroExterior= miDisco2.perimetroExterior();
		
		assertEquals(valorEsperadoDelPerimetroExterior, valorDelPerimetroExterior, 31.0);
	}
	
	@Test
	public void TestDeSuperficie()
	{
		Disco miDisco3 = new Disco();
		miDisco3.radioExterior(3.00);
		miDisco3.radioInterior(2.00);
		
		double superficieDeDisco3;
		superficieDeDisco3= miDisco3.superficieDelDisco();
		
		double superficieDelDiscoEsperada;
		superficieDelDiscoEsperada=65.94;
		
		assertEquals(superficieDelDiscoEsperada, superficieDeDisco3, 65.01);
					
		
	}
}
