package estruturacondicional;

public class EscopoInicializacao {
	
	public static void main(String[] args) {
		double preco = 150.00;
		
		/*
		 * Esta variável não poderá ser utilizada
		 * se não for inicializada, gerando erro
		 * de compilação.
		 */
		double desconto;
		
		/*
		 * A variável desconto será inicializada com
		 * valor do produto multiplicado por 0.1 ou 
		 * receberá 0, evitando erro de compilação.
		 */
		if (preco < 250.00) {
			desconto = preco * 0.1;
		}
		else {
			desconto = 0;
		}
		
		System.out.println(desconto);
	}
}