package estruturarepetitiva;

import java.util.Scanner;

public class ExemploPraticoWhile {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int x = teclado.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			x = teclado.nextInt();
		}
		
		System.out.println(soma);
		teclado.close();
	}
}