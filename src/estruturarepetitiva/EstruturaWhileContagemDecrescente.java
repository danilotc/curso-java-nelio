package estruturarepetitiva;

public class EstruturaWhileContagemDecrescente {

	public static void main(String[] args) {
		
		/*
		 * 1) Faz uma contagem decrescente de 4-0.
		 * 2) Necessário declarar uma variável.
		 * 3) Não esquecer de decrementar a variável da condição dentro do bloco,
		 *    do contrário, entrará em loop infinito.
		 */
		int x = 4;
		while (x >= 0) {
			System.out.println(x);
			x -= 1;
		}
	}
}