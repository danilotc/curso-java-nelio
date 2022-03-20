package estruturacondicional;

import java.util.Scanner;

public class CondicionalSwitchCase {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x = entrada.nextInt();
		String dia = "";
		
		switch(x) {
		case 1:
			dia = "segunda";
			break;
		case 2:
			dia = "terça-feira";
			break;
		case 3:
			dia = "quarta-feira";
			break;
		case 4:
			dia = "quinta-feira";
			break;
		case 5:
			dia = "sexta-feira";
			break;
		case 6:
			dia = "sábado";
			break;
		default:
			dia = "valor inválido";
		}
		
		System.out.println("Dia da semana: " + dia);
		entrada.close();
	}
}