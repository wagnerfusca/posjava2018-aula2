public class OrientacaoAObjetos extends Disciplina implements Graduacao, PosGraduacao, EAD {

	public OrientacaoAObjetos() {
		setHorasAula(40);
		setFrequenciaMinima(100);
	}

	public void calcularNotaDeParticipacao(){
		
	}

	@Override
	public String getFrequenciaMinimaDaDisciplina() {
		return null;
	}
}
