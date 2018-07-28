import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class InteiroTest {
	private Inteiro inteiro; 
	
	@Before
	public void init(){
		inteiro = new Inteiro();
	}
	
	@Test
	public void exercicioUmTest(){
		Integer resultado = inteiro.somar(2 , 3);
		Assert.assertTrue(resultado == 5);
		
		Integer valorEsperado = 5;
		Assert.assertEquals("mensagem: ", valorEsperado, resultado);
		
		Assert.assertFalse(valorEsperado == 6 );
		
	}
	
	@Test
	public void exercicioDoisTest(){
		Assert.assertTrue(inteiro.subtrair(2, 1) == 1);
	}
	
	@Test
	public void exercicioCincoTest(){
		Assert.assertTrue(inteiro.validarNumeroPar(2));
		Assert.assertFalse(inteiro.validarNumeroPar(3));
		Assert.assertTrue(!inteiro.validarNumeroPar(3));
		
	}
	
	@Test
	public void exercicioSeteTest(){
		List<Integer> valoresImpares = inteiro.exibirImparesAte100(97);
		Assert.assertTrue(valoresImpares.get(0) == 97);
		Assert.assertTrue(valoresImpares.get(1) == 99);
		Assert.assertTrue(valoresImpares.size() == 2);
		
	}
}

