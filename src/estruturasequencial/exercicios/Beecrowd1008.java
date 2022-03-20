package estruturasequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1008 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int idFuncionario, horasTrabalhadas;
		double valorHora, salario;
		
		idFuncionario = entrada.nextInt();
		horasTrabalhadas = entrada.nextInt();
		valorHora = entrada.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("ID = " + idFuncionario);
		System.out.printf("Salário = R$ %.2f%n", salario);
		entrada.close();
	}
}