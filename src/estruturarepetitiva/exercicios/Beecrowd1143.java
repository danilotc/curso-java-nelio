package estruturarepetitiva.exercicios;

import java.util.Scanner;

public class Beecrowd1143 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		
		for (int i = 1; i <= n; i++) {
			/* usando variáveis */
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
			
			/* hard core */
			// System.out.printf("%d %d %d%n", i, i*i, i*i*i);
		}
		
		entrada.close();
	}
}