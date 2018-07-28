

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DisciplinaTest {

	private Disciplina disciplina;

	@Test
	public void setarValoresOOTest() {
		disciplina = new OrientacaoAObjetos();
		
		OrientacaoAObjetos oo = new OrientacaoAObjetos();
		oo.calcularNotaDeParticipacao();
		
		
		assertTrue(disciplina.getFrequenciaMinima() == 100);
	}
}

