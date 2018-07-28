public abstract class Disciplina {

	private String nome;

	private Integer horasAula;

	private Integer frequenciaMinima;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setHorasAula(Integer horasAula) {
		this.horasAula = horasAula;
	}

	public void setFrequenciaMinima(Integer frequenciaMinima) {
		this.frequenciaMinima = frequenciaMinima;
	}

	public String getNome() {
		return nome;
	}

	public Integer getHorasAula() {
		return horasAula;
	}

	public Integer getFrequenciaMinima() {
		return frequenciaMinima;
	}

	
	public void calcularMedia(){
		System.out.println("aaaaaa");
		System.out.println("bbbb");
	}
	
	public abstract String getFrequenciaMinimaDaDisciplina();

}
