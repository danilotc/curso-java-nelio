package funcoesparastring;

import java.util.Scanner;

public class FuncaoESintaxe {
	/*
	 * Esta é a função principal, a que irá executar os algoritmos. Está solicitando
	 * três valores numéricos ao usuário e chamando duas funções.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite três números: ");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();

		int maior = max(a, b, c);

		mostrarResultado(maior);

		entrada.close();
	}

	/*
	 * Esta função recebe três valores, descobre qual é o maior entre eles e faz o
	 * retorno desse valor que está sendo armazenado na variável "maior" chamada na
	 * função main.
	 */
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} 
		else if (y > z) {
			aux = y;
		} 
		else {
			aux = z;
		}
		return aux;
	}

	/*
	 * Esta função recebe apenas um valor e não retorna nada, apenas imprime o
	 * resultado na tela.
	 */
	public static void mostrarResultado(int valor) {
		System.out.println("Maior = " + valor);
	}
}