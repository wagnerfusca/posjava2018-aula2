
public class Texto {

	public String retornarMaiusculo(String parametro) {
		return parametro.toUpperCase();
	}

	public Integer retornarQuantidadeCaracteres(String parametro) {
		return parametro.length();
	}

	public String exibirAPartirDaTerceiraLetra(String parametro) {
		return parametro.substring(2);
	}

	public String exibirQuatroUltimasLetras(String parametro) {
		return parametro.substring(parametro.length() - 4);
	}

	public String substituirPrimeiroNome(String parametro) {
		String[] texto = parametro.split(" ");
		return "ALUNO/ALUNA " + texto[1];
	}

	public String exibirTextoInvertido(String parametro) {
		StringBuilder sb = new StringBuilder(parametro);
		return sb.reverse().toString();
	}

	public Integer exibirVogais(String parametro) {
		return parametro.replaceAll("[^aeiouAEIOU]","").length();
	}

}
