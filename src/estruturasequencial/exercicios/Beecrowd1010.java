package estruturasequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1010 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double preco1, preco2, total;
		
		cod1 = entrada.nextInt();
		qtd1 = entrada.nextInt();
		preco1 = entrada.nextDouble();
		
		cod2 = entrada.nextInt();
		qtd2 = entrada.nextInt();
		preco2 = entrada.nextDouble();
		
		total = qtd1 * preco1 + qtd2 * preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		entrada.close();
	}
}