package bitwise;

import java.util.Scanner;

public class OperadorBitwiseExemplo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mascara = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mascara) != 0) {
			System.out.println("6º bit é verdadeiro");
		}
		else {
			System.out.println("6º bit é falso");
		}
		
		sc.close();
	}
}