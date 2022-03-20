
package estruturarepetitiva.testedemesafor;

public class TesteDeMesa4 {
	
	public static void main(String[] args) {
		
		/**
		 * Apresenta erro de compilação porque as
		 * variáveis x e y não estão sendo usadas
		 */
		for (int i=1; i < 5; i++) {
			int y = i - 1;
			int x = i * 10;
			System.out.print(i);
		}
	}
}