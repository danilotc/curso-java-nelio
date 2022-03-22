package estruturarepetitiva.exercicios;

import java.util.Scanner;

public class Beecrowd1070 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		
		for (int i=1; i < 11; i++) {
			System.out.println(i + " x " + N + " = " + i*N);
		}
		
		teclado.close();
	}
}