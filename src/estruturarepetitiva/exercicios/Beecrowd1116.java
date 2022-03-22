package estruturarepetitiva.exercicios;

import java.util.Scanner;

public class Beecrowd1116 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = entrada.nextInt(); // numerador
			int y = entrada.nextInt(); // denominador
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		
		entrada.close();
	}
}