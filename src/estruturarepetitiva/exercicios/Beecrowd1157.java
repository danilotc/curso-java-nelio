package estruturarepetitiva.exercicios;

import java.util.Scanner;

public class Beecrowd1157 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		entrada.close();
	}
}