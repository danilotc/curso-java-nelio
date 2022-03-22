package estruturarepetitiva.exercicios;

import java.util.Scanner;

public class Beecrowd1153 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		
		int fat = 1;
		for (int i = 1; i <= n; i++) {
			fat = fat * i;
		}
		
		System.out.print(fat);
		entrada.close();
	}
}