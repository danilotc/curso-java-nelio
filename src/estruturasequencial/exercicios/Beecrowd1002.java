package estruturasequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1002 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		final double PI = 3.14159;
		double area, raio;
		
		System.out.print("Raio: ");
		raio = entrada.nextDouble();
		
		// Calculando área da circunferência
		area = PI * (raio * raio);
		
		System.out.printf("Area = %.4f%n", area);
		
		entrada.close();
	}
}