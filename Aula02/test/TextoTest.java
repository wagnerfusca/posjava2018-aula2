import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class TextoTest {

	private static final String WAGNER_FUSCA = "Wagner Fusca";
	private static final String FUSCA = "FUSCA";
	private Texto texto;
	
	@Before
	public void init(){
		texto = new Texto();
	}
	
	@Test
	public void retornarMaiusculoTest(){
		assertEquals(FUSCA, texto.retornarMaiusculo("fusca"));
		assertEquals(FUSCA, texto.retornarMaiusculo("Fusca"));
		assertEquals(FUSCA, texto.retornarMaiusculo("FuSca"));
	}
	
	@Test
	public void retornarQuantidadeCaracteresTest(){
		assertTrue(texto.retornarQuantidadeCaracteres(FUSCA) == 5);
		assertTrue(texto.retornarQuantidadeCaracteres("123UNICESUMAR") == 13);
	}
	
	@Test
	public void exibirAPartirDaTerceiraLetraTest(){
		assertEquals("gner Fusca", texto.exibirAPartirDaTerceiraLetra(WAGNER_FUSCA));
		assertTrue("gner Fusca".equals(texto.exibirAPartirDaTerceiraLetra(WAGNER_FUSCA)));
	}
	
	@Test
	public void exibirQuatroUltimasLetrasTest(){
		assertEquals("usca", texto.exibirQuatroUltimasLetras(WAGNER_FUSCA));
	}
	
	@Test
	public void substituirPrimeiroNomeTest(){
		assertEquals("ALUNO/ALUNA Fusca", texto.substituirPrimeiroNome(WAGNER_FUSCA));
	}
	
	@Test
	public void exibirTextoInvertidoTest(){
		assertEquals("acsuF rengaW", texto.exibirTextoInvertido(WAGNER_FUSCA));
	}
	
	@Test
	public void exibirVogaisTest(){
		assertTrue(texto.exibirVogais(WAGNER_FUSCA) == 4);
	}
	
	
}
