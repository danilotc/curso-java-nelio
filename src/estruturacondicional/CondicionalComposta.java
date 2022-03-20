package estruturacondicional;

import java.util.Scanner;

public class CondicionalComposta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int hora;
		
		System.out.print("Quantas horas? ");
		hora = entrada.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		}
		else {
			System.out.println("Boa tarde");
		}
		
		entrada.close();
	}
}