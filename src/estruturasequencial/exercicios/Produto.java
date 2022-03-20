package estruturasequencial.exercicios;

import java.util.Locale;

public class Produto {
	
	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Mesa de trabalho";
		
		int idade = 30;
		int cep = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produtos:");
		System.out.printf("%s, com preço R$ %.2f%n", produto1, preco1);
		System.out.printf("%s, com preço R$ %.2f%n", produto2, preco2);
		System.out.println();
		System.out.printf("Registro: %d anos, cep %d e sexo %s%n", idade, cep, genero);
		System.out.println();
		System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
		System.out.printf("Arredondado (com três casas decimais): %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto para separar valor decimal (US): %.3f", medida);
	}
}