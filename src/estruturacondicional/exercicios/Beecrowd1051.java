package estruturacondicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1051 {
	
	/*
	 * O enunciado deste exercício estava muito confuso, acredito
	 * que seja algo parecido com um projeto que fiz em Python:
	 * https://github.com/danilotc/calculo-inss
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double salario = entrada.nextDouble();
		double imposto;
		
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if  (imposto == 0.0) {
			System.out.println("Insento");
		} 
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		entrada.close();
	}
}