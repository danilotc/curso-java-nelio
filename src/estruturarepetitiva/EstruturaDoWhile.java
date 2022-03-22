package estruturarepetitiva;

import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char resp;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = entrada.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Fahrenheit: %.1f%n", F);
			System.out.print("Deseja continuar? (s/n) ");
			resp = entrada.next().charAt(0);
		} while (resp != 'n');
		
		entrada.close();
	}
}