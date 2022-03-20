package estruturasequencial.saida;

public class QuebraDeLinha {

	public static void main(String[] args) {
		/*
		 * OBSERVAÇÃO PARA USO DE QUEBRA DE LINHA:
		 *   println = automático
		 *   \n      = para strings em print e println
		 *   %n      = para strings em printf
		 */
		System.out.print("Texto1 ");
		System.out.print("Texto2 ");
		System.out.print("Texto3\n");
		System.out.println("Texto4");
		
		String nome = "Danilo";
		System.out.printf("Prazer em conhecer, %s!%n", nome);
		System.out.printf("%s", "Acabou");
	}
}