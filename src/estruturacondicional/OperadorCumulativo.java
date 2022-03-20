package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class OperadorCumulativo {
	
	/*
	 * Este método tem por objetivo mostrar o uso
	 * dos operadores cumulativos, sendo eles:
	 * 
	 * Adição:        a += b | a = a + b
	 * Subtração:     a -= b | a = a - b
	 * Multiplicação: a *= b | a = a * b
	 * Divisão:       a /= b | a = a / b
	 * Módulo:        a %= b | a = a % b
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int minutos = entrada.nextInt();
		double conta = 50.0;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		entrada.close();
	}
}