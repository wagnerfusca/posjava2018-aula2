import java.util.ArrayList;
import java.util.List;


public class Inteiro {

	public Integer somar(int valor1, int valor2) {
		return valor1 + valor2;
		
	}
	
	public Integer subtrair(int valor1, int valor2){
		return valor1 - valor2;
	}

	public Boolean validarNumeroPar(Integer valor) {
		return valor % 2 == 0;
	}

	public List<Integer> exibirImparesAte100(Integer valorInicial) {
		List<Integer> valoresImpares = new ArrayList<>();
		
		for (Integer contador = valorInicial; contador < 100; contador++){
			if (!validarNumeroPar(contador)){
				valoresImpares.add(contador);
			}
		}
		return valoresImpares;
	}

}
