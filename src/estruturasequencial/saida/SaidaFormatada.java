package estruturasequencial.saida;

public class SaidaFormatada {
	
	public static void main(String[] args) {
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		/**
		 * Interpolando string com a função printf usando máscaras:
		 *   %s = texto (string)
		 *   %c = caractere (char)
		 *   %d = inteiro (int)
		 *   %f = ponto flutuante (double)
		 *        %.1f = valor com 1 casa decimal
		 *        %.2f = valor com 2 casas decimais
		 *   %n = quebra de linha para printf
		 */
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}
}