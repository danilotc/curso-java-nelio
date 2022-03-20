package estruturarepetitiva;

public class EstruturaWhileContagemCrescente {

	public static void main(String[] args) {
		
		/*
		 * 1) Faz uma contagem crescente de 0-4.
		 * 2) Necessário declarar uma variável.
		 * 3) Não esquecer de incrementar a variável da condição dentro do bloco,
		 *    do contrário, entrará em loop infinito.
		 */
		int x = 0;
		while (x < 5) {
			System.out.println(x);
			x += 1;
		}
	}
}