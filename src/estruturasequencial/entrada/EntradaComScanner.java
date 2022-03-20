package estruturasequencial.entrada;

import java.util.Locale;
import java.util.Scanner;

public class EntradaComScanner {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
//		String x;
//		x = sc.next(); // leitura de texto
//		System.out.println("Você digitou: " + x);
		
//		int x;
//		x = sc.nextInt(); // leitura de inteiro		
//		System.out.println("Você digitou: " + x);
		
//		double x;
//		x = sc.nextDouble(); // leitura de decimal (uso do pacote locale)
//		System.out.println("Você digitou: " + x);		
		
//		char x;
//		x = sc.next().charAt(0); // leitura de texto (pega primeiro caractere)
//		System.out.println("Você digitou: " + x);		
		
		String x;
		int y;
		double z;
		
		x = entrada.next();
		y = entrada.nextInt();
		z = entrada.nextDouble();
		
		System.out.println("Você digitou:"); // ex: João 23 5.7
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		entrada.close();
	}
}