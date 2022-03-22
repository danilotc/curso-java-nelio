package estruturarepetitiva.exercicios;

import java.util.Scanner;

public class Beecrowd1071 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int x = teclado.nextInt();
		int y = teclado.nextInt();
		int soma = 0;
		int min, max;
		
		if (x < y) {
			min = x;
			max = y;
		}
		else {
			min = y;
			max = x;
		}
		
		for (int i=min+1; i < max; i++) {
			if (i % 2 != 0) {
				soma += i; // soma = soma + i
			}
		}
		
		System.out.println(soma);
		teclado.close();
	}
}