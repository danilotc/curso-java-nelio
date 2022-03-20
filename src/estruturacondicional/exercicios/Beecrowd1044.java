package estruturacondicional.exercicios;

import java.util.Scanner;

public class Beecrowd1044 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A, B;
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}
		
		entrada.close();
	}
}