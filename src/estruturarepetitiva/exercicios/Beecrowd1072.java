package estruturarepetitiva.exercicios;

import java.util.Scanner;

public class Beecrowd1072 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i = 1; i <= n; i++) {
			int x = entrada.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1; // in = in + 1
			}
			else {
				out += 1; // out = out + 1
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		entrada.close();
	}
}