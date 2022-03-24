package funcoesparastring;

public class FuncoesParaStringParte2 {
	public static void main(String[] args) {
		String s = "batata melancia limao laranja";

		String[] vect = s.split(" ");

		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
	}
}