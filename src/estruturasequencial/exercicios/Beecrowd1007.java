package estruturasequencial.exercicios;

import java.util.Scanner;

public class Beecrowd1007 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A, B, C, D, dif;
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		D = entrada.nextInt();
		
		dif = A * B - C * D;
		
		System.out.println("DIFERENÇA = " + dif);
		entrada.close();
	}
}