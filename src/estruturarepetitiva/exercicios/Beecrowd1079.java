package estruturarepetitiva.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		
		for (int i = 0; i < n; i++) {
			double v1 = entrada.nextDouble();
			double v2 = entrada.nextDouble();
			double v3 = entrada.nextDouble();
			
			double media = (v1 * 2.0 + v2 * 3.0 + v3 * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}
		
		entrada.close();
	}
}