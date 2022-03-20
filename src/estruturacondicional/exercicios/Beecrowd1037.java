package estruturacondicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1037 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double valor = entrada.nextDouble();
		String intervalo;
		
		if (valor < 0.0 || valor > 100.0) {
			intervalo = "Fora do intervalo";
		}
		else if(valor <= 25.0) {
			intervalo = "Intervalo [0,25]";
		}
		else if (valor <= 50.0) {
			intervalo = "Intervalo (25,50]";
		}
		else if (valor <= 75.0) {
			intervalo = "Intervalo (50,75]";
		}
		else {
			intervalo = "Intervalo (75,100]";
		}
		
		System.out.println(intervalo);
		entrada.close();
	}
}