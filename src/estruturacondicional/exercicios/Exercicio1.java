package estruturacondicional.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = entrada.nextInt();
		
		// O número digitado está abaixo de 0?
		if (numero < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
		
		entrada.close();
	}
}